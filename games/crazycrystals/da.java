/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class da extends ue {
    private double field_h;
    private boolean field_f;
    private re field_n;
    private int field_o;
    private int field_m;
    private boolean field_l;
    private boolean field_q;
    private int field_s;
    private int field_g;
    private int field_e;
    private boolean field_k;
    private int field_i;
    private int field_r;
    private f[][] field_p;
    private int field_j;

    private final void c() {
        if (((da) this).field_r != 1) {
            return;
        }
        int var2 = ((da) this).field_s + 1;
        if (mo.field_l == 0) {
            if (~((da) this).field_e <= ~var2) {
                if (!(~((da) this).field_g >= ~((da) this).field_e)) {
                    ((da) this).field_e = var2 + -1;
                }
            }
            if (((da) this).field_g + 1 > var2) {
                var2 = 1 + ((da) this).field_g;
            }
        }
        if (~((da) this).field_e <= ~var2) {
            if (((da) this).field_e < 20) {
                ((da) this).field_e = var2 + -1;
            }
        }
        if (var2 < 22) {
            var2 = 22;
        }
        if (~((da) this).field_e <= ~var2) {
            if (((da) this).field_e < 40) {
                ((da) this).field_e = var2 + -1;
            }
        }
        if (var2 < 42) {
            var2 = 42;
        }
        if (var2 <= ((da) this).field_e) {
            if (60 > ((da) this).field_e) {
                ((da) this).field_e = -1 + var2;
            }
        }
    }

    private final int b(int param0, int param1) {
        int var5 = 0;
        int var3 = param0;
        int var4 = ((da) this).field_m;
        var3 = var3 + this.c(param0, 20);
        var4 = var4 + this.c(((da) this).field_m, 20);
        int var6 = 74 % ((42 - param1) / 54);
        if (var4 > 13) {
            var5 = -(20 * ((da) this).field_j) + 230;
        } else {
            var5 = 230 + -(10 * var4);
        }
        return var5 + var3 * 20;
    }

    private final int c(byte param0) {
        int var3 = -16 / ((-24 - param0) / 37);
        int var2 = -7 + ((da) this).field_m;
        var2 = var2 + this.c(((da) this).field_m, 20);
        return var2;
    }

    private final boolean f(int param0, int param1) {
        if (param0 < ((da) this).field_s) {
          return true;
        } else {
          if (param1 > 1) {
            L0: {
              if (((da) this).field_r != 1) {
                break L0;
              } else {
                if (param0 == 20) {
                  return true;
                } else {
                  if (40 != param0) {
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    da(re param0, int param1, int param2, int param3) {
        super(param3 + 5);
        ((da) this).field_o = -1;
        try {
            if (!(a.field_b instanceof da)) {
                co.field_x = 0;
            }
            ((da) this).field_m = param3;
            ((da) this).field_n = param0;
            ((da) this).field_r = param1;
            int discarded$0 = 0;
            this.b();
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "da.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int e(int param0, int param1) {
        if (((da) this).field_r != 1) {
            return param1;
        }
        int var3 = param1;
        int var4 = 1 + ((da) this).field_s;
        if (!(0 != mo.field_l)) {
            if (!(var4 + -1 != param1)) {
                var3 = -1 + ((da) this).field_g;
            }
            if (!(var4 >= 1 + ((da) this).field_g)) {
                var4 = 1 + ((da) this).field_g;
            }
        }
        if (!(param1 != var4 + -1)) {
            var3 = 19;
        }
        if (!(var4 >= 22)) {
            var4 = 22;
        }
        if (!(var4 - 1 != param1)) {
            var3 = 39;
        }
        if (!(var4 >= 42)) {
            var4 = 42;
        }
        if (param1 == -1 + var4) {
            var3 = 59;
        }
        if (!(param1 <= var3)) {
            var3 = param1;
        }
        if (param0 < 101) {
            int discarded$0 = this.c(24, 119);
        }
        return var3;
    }

    private final String a(String param0, int param1) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_7_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (((da) this).field_r != 1) {
              stackOut_2_0 = (String) param0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              var4_int = this.e(118, param1);
              if (param1 == var4_int) {
                stackOut_7_0 = (String) param0;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_5_0 = param1 + 1 + "-" + (1 + var4_int) + ". ";
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("da.W(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + 20 + ')');
        }
        return stackIn_8_0;
    }

    final static boolean a(int param0, byte param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        L0: {
          if (!param2) {
            if (jk.field_g[param3] > jk.field_g[param0]) {
              return true;
            } else {
              if (jk.field_g[param3] < jk.field_g[param0]) {
                return false;
              } else {
                if (mh.field_l[param0] < mh.field_l[param3]) {
                  return true;
                } else {
                  if (mh.field_l[param3] < mh.field_l[param0]) {
                    return false;
                  } else {
                    break L0;
                  }
                }
              }
            }
          } else {
            if (mh.field_l[param3] <= mh.field_l[param0]) {
              if (mh.field_l[param3] >= mh.field_l[param0]) {
                if (jk.field_g[param0] < jk.field_g[param3]) {
                  return true;
                } else {
                  if (jk.field_g[param3] >= jk.field_g[param0]) {
                    break L0;
                  } else {
                    return false;
                  }
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        }
        var4 = dk.field_l[param0] - -j.field_i[param0] - -cd.field_u[param0];
        var5 = cd.field_u[param3] + j.field_i[param3] + dk.field_l[param3];
        if (var4 < var5) {
          return true;
        } else {
          var6 = -84;
          if (var4 <= var5) {
            L1: {
              if (param3 <= param0) {
                stackOut_29_0 = 0;
                stackIn_30_0 = stackOut_29_0;
                break L1;
              } else {
                stackOut_28_0 = 1;
                stackIn_30_0 = stackOut_28_0;
                break L1;
              }
            }
            return stackIn_30_0 != 0;
          } else {
            return false;
          }
        }
    }

    final void b(int param0) {
        int var2 = 0;
        f[][] var3 = null;
        String var3_ref = null;
        double var4 = 0.0;
        String var4_ref_String = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        f[][] var11 = null;
        re stackIn_5_0 = null;
        re stackIn_6_0 = null;
        re stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        re stackOut_4_0 = null;
        re stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        re stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        L0: {
          L1: {
            var10 = CrazyCrystals.field_B;
            if (!((da) this).field_f) {
              break L1;
            } else {
              if (co.field_x < 20) {
                ((da) this).field_n.e(122);
                this.g(-47);
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (((da) this).field_n.field_f > 0) {
            ((da) this).field_n.e(48);
            this.g(param0 ^ 121);
            break L0;
          } else {
            L2: {
              ((da) this).field_n.e(18);
              this.g(param0 + 112);
              stackOut_4_0 = ((da) this).field_n;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (((da) this).field_k) {
                stackOut_6_0 = (re) (Object) stackIn_6_0;
                stackOut_6_1 = -1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = (re) (Object) stackIn_5_0;
                stackOut_5_1 = ((da) this).field_r;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            ((re) (Object) stackIn_7_0).a(stackIn_7_1, false);
            break L0;
          }
        }
        L3: {
          var2 = co.field_x * (336 * co.field_x) / 400 + -16;
          wi.a(23, jn.field_o, 122, 336, (byte) -71, 16 + var2);
          if (var2 < 0) {
            var2 = 0;
            break L3;
          } else {
            break L3;
          }
        }
        kh.d(31, 130, 31 + var2, 450);
        if (param0 == 8) {
          L4: {
            L5: {
              this.c(true);
              if (((da) this).field_e < 0) {
                break L5;
              } else {
                if (this.f(((da) this).field_e, 59)) {
                  var11 = ((da) this).field_p;
                  var3 = var11;
                  var4 = ((da) this).field_h;
                  oj.a(false, var3, 320, 320, var4 * (double)var11.length, 31, var4, 130, (byte) -32, (double)var11[0].length * var4);
                  if (((da) this).field_e <= ((da) this).field_i) {
                    break L4;
                  } else {
                    var6 = ci.a(new String[1], io.field_J, 3);
                    var7 = cj.field_E;
                    var8 = 20 * go.field_l.a(var6, 304);
                    var9 = go.field_l.a(var7, 304) * 20;
                    kh.d(31, 130, 320, var8, 0, 192);
                    kh.a(31, var8 + 130, 320, 0, 160);
                    kh.a(31, 130 + (var8 + 1), 320, 0, 128);
                    kh.a(31, 130 + var8 - -2, 320, 0, 96);
                    kh.a(31, 3 + var8 + 130, 320, 0, 64);
                    kh.a(31, var8 + 134, 320, 0, 32);
                    kh.a(31, -5 + -var9 + 450, 320, 0, 32);
                    kh.a(31, -var9 + 446, 320, 0, 64);
                    kh.a(31, 450 + (-var9 - 3), 320, 0, 96);
                    kh.a(31, 448 + -var9, 320, 0, 128);
                    kh.a(31, -1 + (450 - var9), 320, 0, 160);
                    kh.d(31, -var9 + 450, 320, var9, 0, 192);
                    int discarded$3 = go.field_l.a(var6, 39, 132, 304, 316, 16777215, -1, 1, 0, 20);
                    int discarded$4 = go.field_l.a(var7, 39, 132, 304, 316, 16777215, -1, 1, 2, 20);
                    break L4;
                  }
                } else {
                  break L5;
                }
              }
            }
            kh.d(31, 130, 320, 320, 0, 192);
            if (((da) this).field_e >= 0) {
              L6: {
                if (((da) this).field_e >= ((da) this).field_g) {
                  L7: {
                    if (this.e(param0 + 112, ((da) this).field_e) == ((da) this).field_e) {
                      var3_ref = an.field_u;
                      break L7;
                    } else {
                      var3_ref = ro.field_t;
                      break L7;
                    }
                  }
                  var5 = 16760896;
                  var4_ref_String = vl.field_c;
                  break L6;
                } else {
                  L8: {
                    var5 = 8438015;
                    if (this.e(118, ((da) this).field_e) != ((da) this).field_e) {
                      var3_ref = mb.field_a;
                      break L8;
                    } else {
                      var3_ref = go.field_k;
                      break L8;
                    }
                  }
                  var4_ref_String = me.field_d + "<br>" + vo.field_a + "<br>" + bh.field_a;
                  var3_ref = var4_ref_String;
                  var3_ref = var4_ref_String;
                  break L6;
                }
              }
              L9: {
                if (rc.a(-106)) {
                  var3_ref = var3_ref + "<br><br>" + var4_ref_String;
                  break L9;
                } else {
                  break L9;
                }
              }
              int discarded$5 = go.field_l.a(var3_ref, 39, 130, 304, 320, var5, -1, 1, 1, 20);
              break L4;
            } else {
              break L4;
            }
          }
          L10: {
            kh.c();
            if (co.field_x == 20) {
              go.field_l.b(b.field_b, 611, 54, 16777215, -1);
              kh.f(383, 60, 228, 2, 12640511);
              this.b(((da) this).field_m, 22370, ((da) this).field_d.length);
              break L10;
            } else {
              break L10;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void c(boolean param0) {
        kb var3 = null;
        f[][] var4 = null;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Vector var11 = null;
        L0: {
          var10 = CrazyCrystals.field_B;
          if (((da) this).field_o == ((da) this).field_e) {
            break L0;
          } else {
            L1: {
              L2: {
                if (0 > ((da) this).field_e) {
                  break L2;
                } else {
                  if (this.f(((da) this).field_e, 56)) {
                    L3: {
                      var11 = ol.field_z[((da) this).field_r];
                      var3 = (kb) var11.elementAt(((da) this).field_e);
                      var4 = var3.field_b;
                      var5 = var4[0].length;
                      if (var4.length <= var5) {
                        break L3;
                      } else {
                        var5 = var4.length;
                        break L3;
                      }
                    }
                    var6 = 160.0 / (double)var5;
                    ((da) this).field_h = var6;
                    var8 = 0;
                    var9 = 0;
                    if (var4.length < var4[0].length) {
                      var9 = (var4[0].length - (var4.length + -1)) / 2;
                      ((da) this).field_p = md.a(var9, true, var8, 82, var4);
                      break L1;
                    } else {
                      if (var4.length > var4[0].length) {
                        var8 = (-var4[0].length + var4.length + 1) / 2;
                        ((da) this).field_p = md.a(var9, true, var8, 82, var4);
                        ((da) this).field_o = ((da) this).field_e;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              ((da) this).field_p = null;
              break L1;
            }
            ((da) this).field_o = ((da) this).field_e;
            break L0;
          }
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        var2 = 0;
        L0: while (true) {
          if (480 <= var2) {
            L1: {
              if (co.field_x == 20) {
                this.b(0, 22370, ((da) this).field_m);
                break L1;
              } else {
                break L1;
              }
            }
            var2 = -56 / ((32 - param0) / 59);
            return;
          } else {
            L2: {
              var3 = var2 - 350;
              var4 = -var2 + 130;
              if (var4 <= var3) {
                break L2;
              } else {
                var3 = var4;
                break L2;
              }
            }
            var5 = 256 + -(256 * var3 / 50);
            if (0 <= var5) {
              L3: {
                if (var5 > 256) {
                  var5 = 256;
                  break L3;
                } else {
                  break L3;
                }
              }
              kh.a(371, var2, 260, 0, var5 * co.field_x / 40);
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final boolean a(int param0) {
        L0: {
          if (param0 > 99) {
            break L0;
          } else {
            ((da) this).field_f = false;
            break L0;
          }
        }
        L1: {
          if (((da) this).field_b.field_c < 0) {
            break L1;
          } else {
            if (((da) this).field_m <= ((da) this).field_b.field_c) {
              break L1;
            } else {
              if (((da) this).field_b.a(true)) {
                ((da) this).field_e = ((da) this).field_b.field_c;
                int discarded$1 = 24902;
                this.d();
                return true;
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (((da) this).field_b.field_c != ((da) this).field_m) {
            break L2;
          } else {
            if (!((da) this).field_b.a(true)) {
              break L2;
            } else {
              if (((da) this).field_e < 0) {
                break L2;
              } else {
                if (!this.f(((da) this).field_e, 117)) {
                  break L2;
                } else {
                  ((da) this).field_f = true;
                  return true;
                }
              }
            }
          }
        }
        L3: {
          if (((da) this).field_m + 1 != ((da) this).field_b.field_c) {
            break L3;
          } else {
            if (!((da) this).field_b.a(true)) {
              break L3;
            } else {
              if (!rc.a(-123)) {
                break L3;
              } else {
                ((da) this).field_l = true;
                return true;
              }
            }
          }
        }
        L4: {
          if (2 + ((da) this).field_m != ((da) this).field_b.field_c) {
            break L4;
          } else {
            if (((da) this).field_b.a(true)) {
              ((da) this).field_k = true;
              return true;
            } else {
              break L4;
            }
          }
        }
        L5: {
          if (((da) this).field_b.field_c != 3 + ((da) this).field_m) {
            break L5;
          } else {
            if (!((da) this).field_b.c(96)) {
              break L5;
            } else {
              if (((da) this).field_j <= 6) {
                break L5;
              } else {
                ((da) this).field_j = ((da) this).field_j - 1;
                break L5;
              }
            }
          }
        }
        L6: {
          if (((da) this).field_b.field_c != 4 + ((da) this).field_m) {
            break L6;
          } else {
            if (!((da) this).field_b.c(96)) {
              break L6;
            } else {
              if (((da) this).field_j >= this.c((byte) 98)) {
                break L6;
              } else {
                ((da) this).field_j = ((da) this).field_j + 1;
                return false;
              }
            }
          }
        }
        return false;
    }

    private final int c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        if (((da) this).field_r != 1) {
          return 0;
        } else {
          L0: {
            var3 = 1;
            if (param0 >= 20) {
              var3 += 2;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param0 < 40) {
              break L1;
            } else {
              var3 += 2;
              break L1;
            }
          }
          L2: {
            if (((da) this).field_i < 60) {
              break L2;
            } else {
              if (param0 < 60) {
                break L2;
              } else {
                var3 += 2;
                break L2;
              }
            }
          }
          L3: {
            var4 = ((da) this).field_s + 1;
            if (mo.field_l == 0) {
              L4: {
                var5 = ((da) this).field_g + -var4;
                if (var5 < 0) {
                  break L4;
                } else {
                  if (~((da) this).field_g < ~param0) {
                    if (param0 < var4) {
                      break L4;
                    } else {
                      return -1000;
                    }
                  } else {
                    var3 = var3 - var5;
                    break L4;
                  }
                }
              }
              if (~var4 <= ~(1 + ((da) this).field_g)) {
                break L3;
              } else {
                var4 = 1 + ((da) this).field_g;
                break L3;
              }
            } else {
              break L3;
            }
          }
          L5: {
            var5 = -var4 + param1;
            if (var5 >= 0) {
              if (20 <= param0) {
                var3 = var3 - var5;
                break L5;
              } else {
                if (param0 >= var4) {
                  return -1000;
                } else {
                  break L5;
                }
              }
            } else {
              break L5;
            }
          }
          L6: {
            if (var4 < 22) {
              var4 = 22;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            var5 = 40 - var4;
            if (var5 >= 0) {
              if (param0 < 40) {
                if (var4 <= param0) {
                  return -1000;
                } else {
                  break L7;
                }
              } else {
                var3 = var3 - var5;
                break L7;
              }
            } else {
              break L7;
            }
          }
          L8: {
            if (var4 < 42) {
              var4 = 42;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            var5 = 60 + -var4;
            if (var5 < 0) {
              break L9;
            } else {
              if (param0 < 60) {
                if (~param0 > ~var4) {
                  break L9;
                } else {
                  return -1000;
                }
              } else {
                var3 = var3 - var5;
                break L9;
              }
            }
          }
          L10: {
            var5 = -60 + ((da) this).field_m;
            if (((da) this).field_i >= 60) {
              break L10;
            } else {
              if (((da) this).field_m <= param0) {
                var3 = var3 - var5;
                break L10;
              } else {
                if (60 <= param0) {
                  return -1000;
                } else {
                  break L10;
                }
              }
            }
          }
          return var3;
        }
    }

    private final void d() {
        if (!(!this.d(((da) this).field_e, -1))) {
            return;
        }
        ((da) this).field_j = ((da) this).field_e;
        ((da) this).field_j = ((da) this).field_j + this.c(((da) this).field_e, 20);
        int discarded$0 = 17832;
        this.e();
    }

    final static int a() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_56_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_58_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_73_0 = 0;
        var5 = CrazyCrystals.field_B;
        try {
          L0: {
            wn.field_b = wn.field_b + 65536;
            L1: while (true) {
              if (65536 > pn.b(wn.field_b, 160, h.field_a)) {
                L2: {
                  var2_int = -1;
                  if (nl.field_f != null) {
                    var2_int = nl.field_f.length;
                    break L2;
                  } else {
                    if (ld.field_v == null) {
                      break L2;
                    } else {
                      var2_int = ld.field_v.length;
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var2_int == -1) {
                    break L3;
                  } else {
                    L4: {
                      if (h.field_c > mb.field_f) {
                        L5: {
                          mb.field_f = mb.field_f + 1;
                          if (mb.field_f <= h.field_b) {
                            break L5;
                          } else {
                            L6: {
                              if (null == nl.field_f) {
                                break L6;
                              } else {
                                if (null == nl.field_f[ue.field_a]) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            mb.field_f = mb.field_f - 1;
                            break L4;
                          }
                        }
                        if (h.field_c > mb.field_f) {
                          break L4;
                        } else {
                          if (null != nl.field_f[(1 + ue.field_a) % var2_int]) {
                            break L4;
                          } else {
                            mb.field_f = mb.field_f - 1;
                            break L4;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    L7: {
                      if (mb.field_f >= h.field_c) {
                        L8: {
                          rd.field_f = ue.field_a;
                          if (!ve.field_t) {
                            ue.field_a = ue.field_a - 1;
                            if (0 > ue.field_a) {
                              ue.field_a = ue.field_a + var2_int;
                              break L8;
                            } else {
                              break L8;
                            }
                          } else {
                            ue.field_a = ue.field_a + 1;
                            if (ue.field_a < var2_int) {
                              break L8;
                            } else {
                              ue.field_a = ue.field_a - var2_int;
                              break L8;
                            }
                          }
                        }
                        mb.field_f = mb.field_f - h.field_c;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if (mb.field_f <= h.field_b) {
                      break L3;
                    } else {
                      ve.field_t = true;
                      break L3;
                    }
                  }
                }
                L9: {
                  if (qk.field_H == null) {
                    break L9;
                  } else {
                    L10: {
                      var3 = 357 + -(qk.field_H.field_o / 2);
                      var4 = 0;
                      if (pj.field_v == 0) {
                        break L10;
                      } else {
                        if (var3 >= dp.field_h) {
                          break L10;
                        } else {
                          if (var3 + qk.field_H.field_u > dp.field_h) {
                            L11: {
                              if (to.field_a <= 269 - qk.field_H.field_l) {
                                break L11;
                              } else {
                                if (269 <= to.field_a) {
                                  break L11;
                                } else {
                                  var4 = 1;
                                  ve.field_t = false;
                                  mb.field_f = h.field_c;
                                  break L11;
                                }
                              }
                            }
                            if (to.field_a <= 586) {
                              break L10;
                            } else {
                              if (qk.field_H.field_l + 586 > to.field_a) {
                                var4 = 1;
                                ve.field_t = true;
                                mb.field_f = h.field_c;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L9;
                    } else {
                      if (h.field_b >= mb.field_f) {
                        break L9;
                      } else {
                        if (var3 >= bm.field_h) {
                          break L9;
                        } else {
                          if (bm.field_h >= qk.field_H.field_u + var3) {
                            break L9;
                          } else {
                            L12: {
                              if (-qk.field_H.field_l + 269 >= qh.field_i) {
                                break L12;
                              } else {
                                if (qh.field_i >= 269) {
                                  break L12;
                                } else {
                                  mb.field_f = h.field_b;
                                  break L12;
                                }
                              }
                            }
                            if (qh.field_i <= 586) {
                              break L9;
                            } else {
                              if (qh.field_i < 586 - -qk.field_H.field_l) {
                                mb.field_f = h.field_b;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L13: {
                  bc.field_f.a(0, og.a(0, dp.field_h, to.field_a), og.a(0, bm.field_h, qh.field_i));
                  if (!bc.field_f.a(true)) {
                    break L13;
                  } else {
                    if (0 != bc.field_f.field_c) {
                      if (bc.field_f.field_c != 1) {
                        break L13;
                      } else {
                        stackOut_58_0 = 2;
                        stackIn_59_0 = stackOut_58_0;
                        return stackIn_59_0;
                      }
                    } else {
                      stackOut_55_0 = 3;
                      stackIn_56_0 = stackOut_55_0;
                      return stackIn_56_0;
                    }
                  }
                }
                L14: while (true) {
                  if (!ge.b(-83)) {
                    stackOut_75_0 = 0;
                    stackIn_76_0 = stackOut_75_0;
                    break L0;
                  } else {
                    L15: {
                      bc.field_f.a(0, (byte) 104);
                      if (bc.field_f.a(true)) {
                        if (bc.field_f.field_c != 0) {
                          if (bc.field_f.field_c == 1) {
                            stackOut_69_0 = 1;
                            stackIn_70_0 = stackOut_69_0;
                            return stackIn_70_0;
                          } else {
                            break L15;
                          }
                        } else {
                          stackOut_65_0 = 3;
                          stackIn_66_0 = stackOut_65_0;
                          return stackIn_66_0;
                        }
                      } else {
                        break L15;
                      }
                    }
                    if (pj.field_q == 13) {
                      stackOut_73_0 = 1;
                      stackIn_74_0 = stackOut_73_0;
                      return stackIn_74_0;
                    } else {
                      continue L14;
                    }
                  }
                }
              } else {
                wn.field_b = wn.field_b - h.field_a;
                hl.field_g = hl.field_g + 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2, "da.AA(" + true + ',' + true + ')');
        }
        return stackIn_76_0;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        Object stackIn_57_0 = null;
        Object stackIn_58_0 = null;
        Object stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        Object stackOut_38_0 = null;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_56_0 = null;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        Object stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        var6 = CrazyCrystals.field_B;
        if (!((da) this).field_k) {
          ((da) this).field_n.f(-116);
          ((da) this).field_n.c((byte) 111);
          ((da) this).field_n.a((byte) 20, ((da) this).field_r);
          if (((da) this).field_f) {
            L0: {
              if (co.field_x <= 0) {
                break L0;
              } else {
                co.field_x = co.field_x - 1;
                break L0;
              }
            }
            L1: {
              if (0 == co.field_x) {
                rl.a((byte) 26, ((da) this).field_r, ((da) this).field_e);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            L2: {
              if (!((da) this).field_l) {
                break L2;
              } else {
                L3: {
                  if (0 >= co.field_x) {
                    break L3;
                  } else {
                    co.field_x = co.field_x - 1;
                    break L3;
                  }
                }
                ((da) this).field_n.c(2, 40, 180);
                if (40 > ((da) this).field_n.field_f) {
                  return;
                } else {
                  if (!((da) this).field_q) {
                    rk.a(0);
                    ((da) this).field_b.a(-1, true, -1);
                    ((da) this).field_q = true;
                    return;
                  } else {
                    ((da) this).field_q = false;
                    ((da) this).field_l = false;
                    if (rc.a(-71)) {
                      break L2;
                    } else {
                      int discarded$13 = 0;
                      this.b();
                      break L2;
                    }
                  }
                }
              }
            }
            L4: {
              if (co.field_x >= 20) {
                break L4;
              } else {
                co.field_x = co.field_x + 1;
                break L4;
              }
            }
            L5: {
              ((da) this).field_n.c(-1);
              if (!((da) this).field_b.g(-1)) {
                ((da) this).field_j = ((da) this).field_j + 3 * of.field_H;
                int discarded$14 = 17832;
                this.e();
                L6: while (true) {
                  if (!ge.b(-35)) {
                    break L5;
                  } else {
                    L7: {
                      if (pj.field_q == 80) {
                        L8: {
                          L9: {
                            if (((da) this).field_m <= ((da) this).field_b.field_c) {
                              break L9;
                            } else {
                              if (((da) this).field_e >= 0) {
                                L10: {
                                  if (0 > ((da) this).field_e) {
                                    break L10;
                                  } else {
                                    if (this.f(((da) this).field_e, 32)) {
                                      ((da) this).field_b.field_c = ((da) this).field_m;
                                      break L8;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                if (rc.a(-69)) {
                                  ((da) this).field_b.field_c = 1 + ((da) this).field_m;
                                  break L8;
                                } else {
                                  ((da) this).field_b.field_c = 2 + ((da) this).field_m;
                                  break L8;
                                }
                              } else {
                                break L9;
                              }
                            }
                          }
                          L11: {
                            if (((da) this).field_e >= 0) {
                              break L11;
                            } else {
                              L12: {
                                stackOut_38_0 = this;
                                stackIn_40_0 = stackOut_38_0;
                                stackIn_39_0 = stackOut_38_0;
                                if (((da) this).field_s <= ((da) this).field_i) {
                                  stackOut_40_0 = this;
                                  stackOut_40_1 = 0;
                                  stackIn_41_0 = stackOut_40_0;
                                  stackIn_41_1 = stackOut_40_1;
                                  break L12;
                                } else {
                                  stackOut_39_0 = this;
                                  stackOut_39_1 = ((da) this).field_i;
                                  stackIn_41_0 = stackOut_39_0;
                                  stackIn_41_1 = stackOut_39_1;
                                  break L12;
                                }
                              }
                              ((da) this).field_e = stackIn_41_1;
                              break L11;
                            }
                          }
                          int discarded$15 = 24902;
                          this.d();
                          ((da) this).field_b.field_c = ((da) this).field_e;
                          break L8;
                        }
                        ((da) this).field_b.field_i = false;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L13: {
                      if (pj.field_q != 96) {
                        break L13;
                      } else {
                        L14: while (true) {
                          L15: {
                            if (((da) this).field_b.field_c != ((da) this).field_m - -2) {
                              if (((da) this).field_b.field_c == ((da) this).field_m - -1) {
                                ((da) this).field_b.field_c = ((da) this).field_m;
                                break L15;
                              } else {
                                L16: {
                                  if (((da) this).field_e >= 0) {
                                    break L16;
                                  } else {
                                    L17: {
                                      stackOut_56_0 = this;
                                      stackIn_58_0 = stackOut_56_0;
                                      stackIn_57_0 = stackOut_56_0;
                                      if (((da) this).field_s > ((da) this).field_i) {
                                        stackOut_58_0 = this;
                                        stackOut_58_1 = ((da) this).field_i;
                                        stackIn_59_0 = stackOut_58_0;
                                        stackIn_59_1 = stackOut_58_1;
                                        break L17;
                                      } else {
                                        stackOut_57_0 = this;
                                        stackOut_57_1 = 0;
                                        stackIn_59_0 = stackOut_57_0;
                                        stackIn_59_1 = stackOut_57_1;
                                        break L17;
                                      }
                                    }
                                    ((da) this).field_e = stackIn_59_1;
                                    break L16;
                                  }
                                }
                                int discarded$16 = 24902;
                                this.d();
                                ((da) this).field_b.field_c = ((da) this).field_e;
                                break L15;
                              }
                            } else {
                              ((da) this).field_b.field_c = ((da) this).field_m - -1;
                              break L15;
                            }
                          }
                          L18: {
                            if (((da) this).field_m != ((da) this).field_b.field_c) {
                              break L18;
                            } else {
                              if (((da) this).field_e < 0) {
                                continue L14;
                              } else {
                                if (!this.f(((da) this).field_e, 65)) {
                                  continue L14;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                          L19: {
                            if (((da) this).field_m + 1 != ((da) this).field_b.field_c) {
                              break L19;
                            } else {
                              if (rc.a(-123)) {
                                break L19;
                              } else {
                                continue L14;
                              }
                            }
                          }
                          ((da) this).field_b.field_i = false;
                          break L13;
                        }
                      }
                    }
                    L20: {
                      if (pj.field_q == 97) {
                        L21: while (true) {
                          L22: {
                            if (((da) this).field_b.field_c != ((da) this).field_m) {
                              if (((da) this).field_m - -1 != ((da) this).field_b.field_c) {
                                if (((da) this).field_m - -2 == ((da) this).field_b.field_c) {
                                  break L22;
                                } else {
                                  ((da) this).field_b.field_c = ((da) this).field_m;
                                  break L22;
                                }
                              } else {
                                ((da) this).field_b.field_c = 2 + ((da) this).field_m;
                                break L22;
                              }
                            } else {
                              ((da) this).field_b.field_c = ((da) this).field_m + 1;
                              break L22;
                            }
                          }
                          L23: {
                            if (((da) this).field_m != ((da) this).field_b.field_c) {
                              break L23;
                            } else {
                              if (0 > ((da) this).field_e) {
                                continue L21;
                              } else {
                                if (!this.f(((da) this).field_e, 8)) {
                                  continue L21;
                                } else {
                                  break L23;
                                }
                              }
                            }
                          }
                          L24: {
                            if (((da) this).field_m + 1 != ((da) this).field_b.field_c) {
                              break L24;
                            } else {
                              if (!rc.a(-115)) {
                                continue L21;
                              } else {
                                break L24;
                              }
                            }
                          }
                          ((da) this).field_b.field_i = false;
                          break L20;
                        }
                      } else {
                        break L20;
                      }
                    }
                    L25: {
                      if (pj.field_q == 98) {
                        L26: while (true) {
                          L27: {
                            if (2 + ((da) this).field_m != ((da) this).field_b.field_c) {
                              if (((da) this).field_b.field_c != ((da) this).field_m + 1) {
                                if (((da) this).field_b.field_c == ((da) this).field_m) {
                                  L28: {
                                    if (((da) this).field_e >= 0) {
                                      break L28;
                                    } else {
                                      ((da) this).field_e = -1 + ((da) this).field_m;
                                      break L28;
                                    }
                                  }
                                  int discarded$17 = 24902;
                                  this.d();
                                  ((da) this).field_b.field_c = ((da) this).field_e;
                                  break L27;
                                } else {
                                  if (0 < ((da) this).field_e) {
                                    ((da) this).field_e = ((da) this).field_e - 1;
                                    int discarded$18 = 24902;
                                    this.d();
                                    ((da) this).field_b.field_c = ((da) this).field_e;
                                    break L27;
                                  } else {
                                    ((da) this).field_b.field_c = 2 + ((da) this).field_m;
                                    ((da) this).field_e = -1;
                                    break L27;
                                  }
                                }
                              } else {
                                ((da) this).field_b.field_c = ((da) this).field_m;
                                break L27;
                              }
                            } else {
                              ((da) this).field_b.field_c = 1 + ((da) this).field_m;
                              break L27;
                            }
                          }
                          L29: {
                            if (((da) this).field_m != ((da) this).field_b.field_c) {
                              break L29;
                            } else {
                              if (((da) this).field_e < 0) {
                                continue L26;
                              } else {
                                if (!this.f(((da) this).field_e, 20)) {
                                  continue L26;
                                } else {
                                  break L29;
                                }
                              }
                            }
                          }
                          L30: {
                            if (((da) this).field_b.field_c != ((da) this).field_m - -1) {
                              break L30;
                            } else {
                              if (rc.a(-93)) {
                                break L30;
                              } else {
                                continue L26;
                              }
                            }
                          }
                          if (this.d(((da) this).field_b.field_c, -1)) {
                            continue L26;
                          } else {
                            ((da) this).field_b.field_i = false;
                            break L25;
                          }
                        }
                      } else {
                        break L25;
                      }
                    }
                    L31: {
                      if (99 != pj.field_q) {
                        break L31;
                      } else {
                        L32: while (true) {
                          L33: {
                            if (((da) this).field_b.field_c == ((da) this).field_m) {
                              ((da) this).field_b.field_c = ((da) this).field_m - -1;
                              break L33;
                            } else {
                              if (((da) this).field_b.field_c != ((da) this).field_m + 1) {
                                L34: {
                                  if (((da) this).field_b.field_c != 2 + ((da) this).field_m) {
                                    break L34;
                                  } else {
                                    if (((da) this).field_e >= 0) {
                                      break L33;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                if (((da) this).field_e < ((da) this).field_m - 1) {
                                  ((da) this).field_e = ((da) this).field_e + 1;
                                  int discarded$19 = 24902;
                                  this.d();
                                  ((da) this).field_b.field_c = ((da) this).field_e;
                                  break L33;
                                } else {
                                  ((da) this).field_b.field_c = ((da) this).field_m;
                                  ((da) this).field_e = -1;
                                  break L33;
                                }
                              } else {
                                ((da) this).field_b.field_c = ((da) this).field_m + 2;
                                break L33;
                              }
                            }
                          }
                          L35: {
                            if (((da) this).field_b.field_c != ((da) this).field_m) {
                              break L35;
                            } else {
                              if (((da) this).field_e < 0) {
                                continue L32;
                              } else {
                                if (!this.f(((da) this).field_e, 23)) {
                                  continue L32;
                                } else {
                                  break L35;
                                }
                              }
                            }
                          }
                          L36: {
                            if (((da) this).field_b.field_c != 1 + ((da) this).field_m) {
                              break L36;
                            } else {
                              if (rc.a(-46)) {
                                break L36;
                              } else {
                                continue L32;
                              }
                            }
                          }
                          if (!this.d(((da) this).field_b.field_c, -1)) {
                            ((da) this).field_b.field_i = false;
                            break L31;
                          } else {
                            continue L32;
                          }
                        }
                      }
                    }
                    L37: {
                      if (pj.field_q != 104) {
                        break L37;
                      } else {
                        L38: {
                          if (((da) this).field_e < 0) {
                            ((da) this).field_e = ((da) this).field_j;
                            break L38;
                          } else {
                            break L38;
                          }
                        }
                        L39: {
                          ((da) this).field_e = ((da) this).field_e - 7;
                          if (((da) this).field_e >= 0) {
                            break L39;
                          } else {
                            ((da) this).field_e = 0;
                            break L39;
                          }
                        }
                        int discarded$20 = -62;
                        this.c();
                        int discarded$21 = 24902;
                        this.d();
                        ((da) this).field_b.field_i = false;
                        ((da) this).field_b.field_c = ((da) this).field_e;
                        break L37;
                      }
                    }
                    L40: {
                      if (pj.field_q == 105) {
                        L41: {
                          if (0 <= ((da) this).field_e) {
                            break L41;
                          } else {
                            ((da) this).field_e = ((da) this).field_j;
                            break L41;
                          }
                        }
                        L42: {
                          ((da) this).field_e = ((da) this).field_e + 7;
                          if (-1 + ((da) this).field_m < ((da) this).field_e) {
                            ((da) this).field_e = -1 + ((da) this).field_m;
                            break L42;
                          } else {
                            break L42;
                          }
                        }
                        this.f(-101);
                        int discarded$22 = 24902;
                        this.d();
                        ((da) this).field_b.field_c = ((da) this).field_e;
                        ((da) this).field_b.field_i = false;
                        break L40;
                      } else {
                        break L40;
                      }
                    }
                    L43: {
                      if (pj.field_q == 102) {
                        ((da) this).field_e = 0;
                        int discarded$23 = 24902;
                        this.d();
                        ((da) this).field_b.field_i = false;
                        ((da) this).field_b.field_c = ((da) this).field_e;
                        break L43;
                      } else {
                        break L43;
                      }
                    }
                    L44: {
                      if (103 == pj.field_q) {
                        ((da) this).field_e = ((da) this).field_m + -1;
                        this.f(116);
                        int discarded$24 = 24902;
                        this.d();
                        ((da) this).field_b.field_c = ((da) this).field_e;
                        ((da) this).field_b.field_i = false;
                        break L44;
                      } else {
                        break L44;
                      }
                    }
                    L45: {
                      L46: {
                        if (pj.field_q == 84) {
                          break L46;
                        } else {
                          if (83 == pj.field_q) {
                            break L46;
                          } else {
                            break L45;
                          }
                        }
                      }
                      L47: {
                        ((da) this).field_b.field_i = false;
                        if (((da) this).field_m + 1 != ((da) this).field_b.field_c) {
                          break L47;
                        } else {
                          if (rc.a(-52)) {
                            ((da) this).field_l = true;
                            return;
                          } else {
                            break L47;
                          }
                        }
                      }
                      if (((da) this).field_b.field_c != ((da) this).field_m + 2) {
                        if (((da) this).field_e < 0) {
                          break L45;
                        } else {
                          if (!this.f(((da) this).field_e, 119)) {
                            break L45;
                          } else {
                            ((da) this).field_f = true;
                            return;
                          }
                        }
                      } else {
                        ((da) this).field_k = true;
                        return;
                      }
                    }
                    if (pj.field_q != 13) {
                      continue L6;
                    } else {
                      ((da) this).field_b.field_i = false;
                      ((da) this).field_k = true;
                      return;
                    }
                  }
                }
              } else {
                break L5;
              }
            }
            var2 = -1;
            var3 = -1;
            var4 = 0;
            L48: while (true) {
              if (((da) this).field_d.length <= var4) {
                ((da) this).field_b.a(0, var3, var2);
                if (!((da) this).a(117)) {
                  L49: {
                    var7 = 0;
                    var4 = var7;
                    if (!param0) {
                      break L49;
                    } else {
                      int discarded$25 = this.c((byte) 35);
                      break L49;
                    }
                  }
                  L50: while (true) {
                    if (((da) this).field_m <= var7) {
                      return;
                    } else {
                      var5 = this.b(var7, -19);
                      if (var5 < ((da) this).field_d[var7].field_d) {
                        ((da) this).field_d[var7].field_d = ((da) this).field_d[var7].field_d + (var5 - ((da) this).field_d[var7].field_d >> 3);
                        var7++;
                        continue L50;
                      } else {
                        ((da) this).field_d[var7].field_d = ((da) this).field_d[var7].field_d - (-var5 + ((da) this).field_d[var7].field_d >> 3);
                        var7++;
                        continue L50;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                if (((da) this).field_d[var4] != null) {
                  L51: {
                    if (var4 != ((da) this).field_m) {
                      break L51;
                    } else {
                      if (0 <= ((da) this).field_e) {
                        if (this.f(((da) this).field_e, 46)) {
                          break L51;
                        } else {
                          var4++;
                          continue L48;
                        }
                      } else {
                        var4++;
                        continue L48;
                      }
                    }
                  }
                  L52: {
                    if (((da) this).field_d[var4].b(0)) {
                      var2 = var4;
                      break L52;
                    } else {
                      break L52;
                    }
                  }
                  if (((da) this).field_d[var4].a(-85)) {
                    var3 = var4;
                    var4++;
                    continue L48;
                  } else {
                    var4++;
                    continue L48;
                  }
                } else {
                  var4++;
                  continue L48;
                }
              }
            }
          }
        } else {
          L53: {
            if (co.field_x <= 0) {
              break L53;
            } else {
              co.field_x = co.field_x - 1;
              break L53;
            }
          }
          L54: {
            if (co.field_x == 0) {
              a.field_b = (ue) (Object) ((da) this).field_n;
              ((da) this).field_n.a(((da) this).field_b.field_i, -13880);
              break L54;
            } else {
              break L54;
            }
          }
          ((da) this).field_n.a(param0);
          return;
        }
    }

    final static void a(String param0, int param1, String param2) {
        if (sp.field_a != null) {
            sp.field_a.i((byte) -18);
        }
        mk.field_b = new vk(param0, param2, false, true, true);
        if (param1 <= 57) {
            return;
        }
        try {
            jm.field_d.a((qm) (Object) mk.field_b, (byte) -50);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "da.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean d(int param0, int param1) {
        if (!(((da) this).field_r == 1)) {
            return false;
        }
        int var3 = 1 + ((da) this).field_s;
        if (!(mo.field_l != 0)) {
            if (param0 >= var3) {
                if (((da) this).field_g > param0) {
                    return true;
                }
            }
            if (!(1 + ((da) this).field_g <= var3)) {
                var3 = 1 + ((da) this).field_g;
            }
        }
        if (~var3 >= ~param0) {
            if (20 > param0) {
                return true;
            }
        }
        if (!(var3 >= 22)) {
            var3 = 22;
        }
        if (param0 >= var3) {
            if (param0 < 40) {
                return true;
            }
        }
        if (!(42 <= var3)) {
            var3 = 42;
        }
        if (~var3 >= ~param0) {
            if (param0 < 60) {
                return true;
            }
        }
        if (60 > ((da) this).field_i) {
            if (param0 >= 60) {
                if (~param0 <= ~((da) this).field_m) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (((da) this).field_r == 1) {
          L0: {
            var2 = 1 + ((da) this).field_s;
            if (mo.field_l != 0) {
              break L0;
            } else {
              L1: {
                if (var2 > ((da) this).field_e) {
                  break L1;
                } else {
                  if (((da) this).field_e >= ((da) this).field_g) {
                    break L1;
                  } else {
                    ((da) this).field_e = ((da) this).field_g;
                    break L1;
                  }
                }
              }
              if (var2 >= ((da) this).field_g - -1) {
                break L0;
              } else {
                var2 = 1 + ((da) this).field_g;
                break L0;
              }
            }
          }
          L2: {
            if (var2 > ((da) this).field_e) {
              break L2;
            } else {
              if (((da) this).field_e < 20) {
                ((da) this).field_e = 20;
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (var2 >= 22) {
              break L3;
            } else {
              var2 = 22;
              break L3;
            }
          }
          L4: {
            if (~((da) this).field_e > ~var2) {
              break L4;
            } else {
              if (((da) this).field_e >= 40) {
                break L4;
              } else {
                ((da) this).field_e = 40;
                break L4;
              }
            }
          }
          L5: {
            var3 = 91 / ((-10 - param0) / 48);
            if (var2 < 42) {
              var2 = 42;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            L7: {
              if (((da) this).field_i < 60) {
                if (~var2 < ~((da) this).field_e) {
                  break L7;
                } else {
                  if (~((da) this).field_e <= ~((da) this).field_m) {
                    break L7;
                  } else {
                    ((da) this).field_e = -1 + var2;
                    break L6;
                  }
                }
              } else {
                if (~((da) this).field_e > ~var2) {
                  break L6;
                } else {
                  if (((da) this).field_e >= 60) {
                    break L7;
                  } else {
                    ((da) this).field_e = 60;
                    break L6;
                  }
                }
              }
            }
            break L6;
          }
          return;
        } else {
          return;
        }
    }

    private final void b() {
        int var3 = 0;
        String var4 = null;
        String var6 = null;
        String var7 = null;
        int var8 = 0;
        Vector var9 = null;
        kb var10 = null;
        String var11 = null;
        String var12 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        L0: {
          var8 = CrazyCrystals.field_B;
          ((da) this).field_p = null;
          ((da) this).field_g = 0;
          ((da) this).field_o = -1;
          if (ol.field_z[((da) this).field_r] != null) {
            ((da) this).field_g = ol.field_z[((da) this).field_r].size();
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          ((da) this).field_i = ke.field_b[((da) this).field_r];
          if (((da) this).field_r != 1) {
            break L1;
          } else {
            if (mo.field_l == 0) {
              ((da) this).field_g = 15;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          ((da) this).field_s = 1 + ((da) this).field_i;
          if (((da) this).field_s <= ((da) this).field_g) {
            break L2;
          } else {
            ((da) this).field_s = ((da) this).field_g;
            break L2;
          }
        }
        L3: {
          stackOut_9_0 = this;
          stackIn_11_0 = stackOut_9_0;
          stackIn_10_0 = stackOut_9_0;
          if (((da) this).field_i < ((da) this).field_s) {
            stackOut_11_0 = this;
            stackOut_11_1 = ((da) this).field_i;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            break L3;
          } else {
            stackOut_10_0 = this;
            stackOut_10_1 = 0;
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            break L3;
          }
        }
        ((da) this).field_e = stackIn_12_1;
        int discarded$2 = 24902;
        this.d();
        ((da) this).field_b.field_c = -1;
        var9 = ol.field_z[((da) this).field_r];
        ((da) this).field_d = new ik[5 + ((da) this).field_m];
        var3 = 0;
        L4: while (true) {
          if (((da) this).field_m <= var3) {
            L5: {
              if (rc.a(-98)) {
                ((da) this).field_d[((da) this).field_m] = (ik) (Object) new mh(380, 398, 240, mh.field_m, 2);
                ((da) this).field_d[1 + ((da) this).field_m] = (ik) (Object) new mh(380, 424, 240, si.field_a, 2);
                break L5;
              } else {
                ((da) this).field_d[((da) this).field_m] = (ik) (Object) new mh(380, 424, 240, mh.field_m, 2);
                break L5;
              }
            }
            ((da) this).field_d[2 + ((da) this).field_m] = (ik) (Object) new mh(380, 450, 240, ag.field_a, 2);
            ((da) this).field_d[((da) this).field_m + 3] = (ik) (Object) new wd(600, 200, 30, 30, false);
            ((da) this).field_d[4 + ((da) this).field_m] = (ik) (Object) new wd(600, 250, 30, 30, true);
            return;
          } else {
            L6: {
              var4 = sm.field_h;
              if (this.f(var3, 4)) {
                L7: {
                  var10 = (kb) var9.elementAt(var3);
                  var11 = var10.field_e;
                  var4 = var11;
                  var4 = var11;
                  if (((da) this).field_i != var3) {
                    break L7;
                  } else {
                    var4 = var11 + mf.field_r;
                    break L7;
                  }
                }
                if (((da) this).field_i < var3) {
                  var4 = var4 + pe.field_n;
                  break L6;
                } else {
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L8: {
              if (var3 < ((da) this).field_g) {
                break L8;
              } else {
                L9: {
                  if (1 != ((da) this).field_r) {
                    break L9;
                  } else {
                    if (var3 == 20) {
                      break L8;
                    } else {
                      if (var3 == 40) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                var4 = ug.field_d;
                var7 = var4;
                var7 = var4;
                break L8;
              }
            }
            L10: {
              var12 = 1 + var3 + ". ";
              var7 = var12;
              var7 = var12;
              int discarded$3 = 20;
              var6 = this.a(var12, var3);
              var7 = var6;
              var7 = var6;
              var7 = null;
              if (((da) this).field_r != 1) {
                break L10;
              } else {
                L11: {
                  if (var3 == 0) {
                    var7 = md.field_t[0];
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (var3 == 20) {
                    var7 = md.field_t[1];
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (var3 != 40) {
                    break L13;
                  } else {
                    var7 = md.field_t[2];
                    break L13;
                  }
                }
                if (var3 != 60) {
                  break L10;
                } else {
                  var7 = md.field_t[3];
                  break L10;
                }
              }
            }
            ((da) this).field_d[var3] = (ik) (Object) new an(-go.field_l.a(var12) + 410, this.b(var3, -15), var6 + var4, 0, var7);
            var3++;
            continue L4;
          }
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ik stackIn_34_0 = null;
        ik stackIn_35_0 = null;
        ik stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        ik stackOut_33_0 = null;
        ik stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        ik stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        var6 = CrazyCrystals.field_B;
        var4 = param0;
        L0: while (true) {
          if (var4 >= param2) {
            return;
          } else {
            if (null != ((da) this).field_d[var4]) {
              L1: {
                if (((da) this).field_m != var4) {
                  break L1;
                } else {
                  if (((da) this).field_e >= 0) {
                    if (this.f(((da) this).field_e, 42)) {
                      break L1;
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
                }
              }
              L2: {
                if (var4 != ((da) this).field_m + 3) {
                  break L2;
                } else {
                  if (13 < ((da) this).field_m) {
                    if (6 < ((da) this).field_j) {
                      break L2;
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
                }
              }
              L3: {
                if (var4 != 4 + ((da) this).field_m) {
                  break L3;
                } else {
                  if (((da) this).field_m > 13) {
                    if (((da) this).field_j < this.c((byte) -90)) {
                      break L3;
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
                }
              }
              L4: {
                var5 = 8438015;
                if (((da) this).field_m <= var4) {
                  var5 = 12640511;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var4 < ((da) this).field_g) {
                  break L5;
                } else {
                  if (((da) this).field_m <= var4) {
                    break L5;
                  } else {
                    L6: {
                      if (((da) this).field_r != 1) {
                        break L6;
                      } else {
                        if (20 == var4) {
                          break L5;
                        } else {
                          if (var4 == 40) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    var5 = 16760896;
                    break L5;
                  }
                }
              }
              L7: {
                L8: {
                  if (var4 == ((da) this).field_b.field_c) {
                    break L8;
                  } else {
                    if (var4 == ((da) this).field_e) {
                      break L8;
                    } else {
                      break L7;
                    }
                  }
                }
                var5 = 16777215;
                break L7;
              }
              L9: {
                stackOut_33_0 = ((da) this).field_d[var4];
                stackIn_35_0 = stackOut_33_0;
                stackIn_34_0 = stackOut_33_0;
                if (16777215 != var5) {
                  stackOut_35_0 = (ik) (Object) stackIn_35_0;
                  stackOut_35_1 = 0;
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  break L9;
                } else {
                  stackOut_34_0 = (ik) (Object) stackIn_34_0;
                  stackOut_34_1 = 1;
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_36_1 = stackOut_34_1;
                  break L9;
                }
              }
              ((ik) (Object) stackIn_36_0).a(stackIn_36_1 != 0, var5, 1);
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final void e() {
        int var2 = 0;
        L0: {
          var2 = this.c((byte) -99);
          if (((da) this).field_j < 6) {
            ((da) this).field_j = 6;
            break L0;
          } else {
            if (var2 >= ((da) this).field_j) {
              break L0;
            } else {
              ((da) this).field_j = var2;
              break L0;
            }
          }
        }
    }

    static {
    }
}
