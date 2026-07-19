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

    private final void c(int param0) {
        int discarded$1 = 0;
        int var2 = 0;
        if (this.field_r == 1) {
          L0: {
            var2 = this.field_s + 1;
            if (mo.field_l == 0) {
              if (this.field_e < var2) {
                break L0;
              } else {
                if (-21 >= (this.field_e ^ -1)) {
                  break L0;
                } else {
                  this.field_e = var2 + -1;
                  break L0;
                }
              }
            } else {
              if (this.field_e < var2) {
                break L0;
              } else {
                if (-21 >= (this.field_e ^ -1)) {
                  break L0;
                } else {
                  this.field_e = var2 + -1;
                  break L0;
                }
              }
            }
          }
          L1: {
            if ((var2 ^ -1) <= -23) {
              if (this.field_e < var2) {
                break L1;
              } else {
                if (-41 >= (this.field_e ^ -1)) {
                  break L1;
                } else {
                  this.field_e = var2 + -1;
                  break L1;
                }
              }
            } else {
              if (this.field_e < var2) {
                break L1;
              } else {
                if (-41 >= (this.field_e ^ -1)) {
                  break L1;
                } else {
                  this.field_e = var2 + -1;
                  break L1;
                }
              }
            }
          }
          L2: {
            if (param0 <= -19) {
              break L2;
            } else {
              discarded$1 = this.c((byte) -122);
              break L2;
            }
          }
          L3: {
            if (var2 >= 42) {
              if (var2 > this.field_e) {
                break L3;
              } else {
                if (60 <= this.field_e) {
                  break L3;
                } else {
                  this.field_e = -1 + var2;
                  break L3;
                }
              }
            } else {
              if (var2 > this.field_e) {
                break L3;
              } else {
                if (60 <= this.field_e) {
                  break L3;
                } else {
                  this.field_e = -1 + var2;
                  break L3;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final int b(int param0, int param1) {
        int var5 = 0;
        int var3 = param0;
        int var4 = this.field_m;
        var3 = var3 + this.c(param0, 20);
        var4 = var4 + this.c(this.field_m, 20);
        int var6 = 74 % ((42 - param1) / 54);
        if (-14 > (var4 ^ -1)) {
            var5 = -(20 * this.field_j) + 230;
        } else {
            var5 = 230 + -(10 * var4);
        }
        return var5 + var3 * 20;
    }

    private final int c(byte param0) {
        int var3 = -16 / ((-24 - param0) / 37);
        int var2 = -7 + this.field_m;
        var2 = var2 + this.c(this.field_m, 20);
        return var2;
    }

    private final boolean f(int param0, int param1) {
        if (param0 < this.field_s) {
          return true;
        } else {
          if (param1 > 1) {
            L0: {
              if (this.field_r != 1) {
                break L0;
              } else {
                if (-21 == (param0 ^ -1)) {
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
        this.field_o = -1;
        try {
            if (!(a.field_b instanceof da)) {
                co.field_x = 0;
            }
            this.field_m = param3;
            this.field_n = param0;
            this.field_r = param1;
            this.b(false);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "da.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int e(int param0, int param1) {
        int discarded$0 = 0;
        if ((this.field_r ^ -1) != -2) {
            return param1;
        }
        int var3 = param1;
        int var4 = 1 + this.field_s;
        if (!(0 != mo.field_l)) {
            if (!(var4 + -1 != param1)) {
                var3 = -1 + this.field_g;
            }
            if (!(var4 >= 1 + this.field_g)) {
                var4 = 1 + this.field_g;
            }
        }
        if (!(param1 != var4 + -1)) {
            var3 = 19;
        }
        if (!(-23 >= (var4 ^ -1))) {
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
            discarded$0 = this.c(24, 119);
        }
        return var3;
    }

    private final String a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_9_0 = null;
        String stackOut_7_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 20) {
                break L1;
              } else {
                this.field_n = (re) null;
                break L1;
              }
            }
            if (-2 != (this.field_r ^ -1)) {
              stackOut_4_0 = (String) (param0);
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4_int = this.e(118, param1);
              if (param1 == var4_int) {
                stackOut_9_0 = (String) (param0);
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_7_0 = param1 + 1 + "-" + (1 + var4_int) + ". ";
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("da.W(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
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
          var6 = 84 / ((-14 - param1) / 55);
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
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
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
            if (!this.field_f) {
              break L1;
            } else {
              if (co.field_x < 20) {
                this.field_n.e(122);
                this.g(-47);
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (this.field_n.field_f > 0) {
            this.field_n.e(48);
            this.g(param0 ^ 121);
            break L0;
          } else {
            L2: {
              this.field_n.e(18);
              this.g(param0 + 112);
              stackOut_4_0 = this.field_n;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (this.field_k) {
                stackOut_6_0 = (re) ((Object) stackIn_6_0);
                stackOut_6_1 = -1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = (re) ((Object) stackIn_5_0);
                stackOut_5_1 = this.field_r;
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
              if ((this.field_e ^ -1) > -1) {
                break L5;
              } else {
                if (this.f(this.field_e, 59)) {
                  var11 = this.field_p;
                  var3 = var11;
                  var4 = this.field_h;
                  oj.a(false, var3, 320, 320, var4 * (double)var11.length, 31, var4, 130, (byte) -32, (double)var11[0].length * var4);
                  if (this.field_e <= this.field_i) {
                    break L4;
                  } else {
                    var6 = ci.a(new String[]{((an) ((Object) this.field_d[this.field_e])).field_p}, io.field_J, 3);
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
                    discarded$3 = go.field_l.a(var6, 39, 132, 304, 316, 16777215, -1, 1, 0, 20);
                    discarded$4 = go.field_l.a(var7, 39, 132, 304, 316, 16777215, -1, 1, 2, 20);
                    break L4;
                  }
                } else {
                  break L5;
                }
              }
            }
            kh.d(31, 130, 320, 320, 0, 192);
            if ((this.field_e ^ -1) <= -1) {
              L6: {
                if (this.field_e >= this.field_g) {
                  L7: {
                    if (this.e(param0 + 112, this.field_e) == this.field_e) {
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
                    if (this.e(118, this.field_e) != this.field_e) {
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
              discarded$5 = go.field_l.a(var3_ref, 39, 130, 304, 320, var5, -1, 1, 1, 20);
              break L4;
            } else {
              break L4;
            }
          }
          L10: {
            kh.c();
            if (-21 == (co.field_x ^ -1)) {
              go.field_l.b(b.field_b, 611, 54, 16777215, -1);
              kh.f(383, 60, 228, 2, 12640511);
              this.b(this.field_m, 22370, this.field_d.length);
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
          if (this.field_o == this.field_e) {
            break L0;
          } else {
            L1: {
              L2: {
                if (0 > this.field_e) {
                  break L2;
                } else {
                  if (this.f(this.field_e, 56)) {
                    L3: {
                      var11 = ol.field_z[this.field_r];
                      var3 = (kb) (var11.elementAt(this.field_e));
                      var4 = var3.field_b;
                      var5 = var4[0].length;
                      if (var4.length <= var5) {
                        break L3;
                      } else {
                        var5 = var4.length;
                        break L3;
                      }
                    }
                    L4: {
                      var6 = 160.0 / (double)var5;
                      this.field_h = var6;
                      var8 = 0;
                      var9 = 0;
                      if (var4.length < var4[0].length) {
                        var9 = (var4[0].length - (var4.length + -1)) / 2;
                        break L4;
                      } else {
                        if (var4.length > var4[0].length) {
                          var8 = (-var4[0].length + var4.length + 1) / 2;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_p = md.a(var9, true, var8, 82, var4);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_p = (f[][]) null;
              break L1;
            }
            this.field_o = this.field_e;
            break L0;
          }
        }
        L5: {
          if (param0) {
            break L5;
          } else {
            this.field_q = false;
            break L5;
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
              if ((co.field_x ^ -1) == -21) {
                this.b(0, 22370, this.field_m);
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
                if ((var5 ^ -1) < -257) {
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
            this.field_f = false;
            break L0;
          }
        }
        L1: {
          if (-1 < (this.field_b.field_c ^ -1)) {
            break L1;
          } else {
            if (this.field_m <= this.field_b.field_c) {
              break L1;
            } else {
              if (this.field_b.a(true)) {
                this.field_e = this.field_b.field_c;
                this.d(24902);
                return true;
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (this.field_b.field_c != this.field_m) {
            break L2;
          } else {
            if (!this.field_b.a(true)) {
              break L2;
            } else {
              if (-1 < (this.field_e ^ -1)) {
                break L2;
              } else {
                if (!this.f(this.field_e, 117)) {
                  break L2;
                } else {
                  this.field_f = true;
                  return true;
                }
              }
            }
          }
        }
        L3: {
          if (this.field_m + 1 != this.field_b.field_c) {
            break L3;
          } else {
            if (!this.field_b.a(true)) {
              break L3;
            } else {
              if (!rc.a(-123)) {
                break L3;
              } else {
                this.field_l = true;
                return true;
              }
            }
          }
        }
        L4: {
          if (2 + this.field_m != this.field_b.field_c) {
            break L4;
          } else {
            if (this.field_b.a(true)) {
              this.field_k = true;
              return true;
            } else {
              break L4;
            }
          }
        }
        L5: {
          if (this.field_b.field_c != 3 + this.field_m) {
            break L5;
          } else {
            if (!this.field_b.c(96)) {
              break L5;
            } else {
              if (this.field_j <= 6) {
                break L5;
              } else {
                this.field_j = this.field_j - 1;
                break L5;
              }
            }
          }
        }
        L6: {
          if (this.field_b.field_c != 4 + this.field_m) {
            break L6;
          } else {
            if (!this.field_b.c(96)) {
              break L6;
            } else {
              if (this.field_j >= this.c((byte) 98)) {
                break L6;
              } else {
                this.field_j = this.field_j + 1;
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
        if (this.field_r != 1) {
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
            if ((param0 ^ -1) > -41) {
              break L1;
            } else {
              var3 += 2;
              break L1;
            }
          }
          L2: {
            if (this.field_i < 60) {
              break L2;
            } else {
              if ((param0 ^ -1) > -61) {
                break L2;
              } else {
                var3 += 2;
                break L2;
              }
            }
          }
          L3: {
            var4 = this.field_s + 1;
            if (mo.field_l == 0) {
              L4: {
                var5 = this.field_g + -var4;
                if ((var5 ^ -1) > -1) {
                  break L4;
                } else {
                  if (this.field_g > param0) {
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
              if (var4 >= 1 + this.field_g) {
                break L3;
              } else {
                var4 = 1 + this.field_g;
                break L3;
              }
            } else {
              break L3;
            }
          }
          L5: {
            var5 = -var4 + param1;
            if (-1 >= (var5 ^ -1)) {
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
            if ((var5 ^ -1) <= -1) {
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
            if (-43 < (var4 ^ -1)) {
              var4 = 42;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            var5 = 60 + -var4;
            if (-1 < (var5 ^ -1)) {
              break L9;
            } else {
              if ((param0 ^ -1) > -61) {
                if (param0 < var4) {
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
            var5 = -60 + this.field_m;
            if ((this.field_i ^ -1) <= -61) {
              break L10;
            } else {
              if (this.field_m <= param0) {
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

    private final void d(int param0) {
        boolean discarded$0 = false;
        if (!(!this.d(this.field_e, -1))) {
            return;
        }
        if (param0 != 24902) {
            discarded$0 = this.f(72, 53);
        }
        this.field_j = this.field_e;
        this.field_j = this.field_j + this.c(this.field_e, param0 + -24882);
        this.e(17832);
    }

    final static int a(boolean param0, boolean param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_59_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_79_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_61_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_78_0 = 0;
        var5 = CrazyCrystals.field_B;
        try {
          L0: {
            wn.field_b = wn.field_b + 65536;
            L1: while (true) {
              if (65536 > pn.b(wn.field_b, 160, h.field_a)) {
                L2: {
                  var2_int = -1;
                  if (param1) {
                    break L2;
                  } else {
                    discarded$1 = da.a(false, true);
                    break L2;
                  }
                }
                L3: {
                  if (nl.field_f != null) {
                    var2_int = nl.field_f.length;
                    break L3;
                  } else {
                    if (ld.field_v == null) {
                      break L3;
                    } else {
                      var2_int = ld.field_v.length;
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var2_int == -1) {
                    break L4;
                  } else {
                    L5: {
                      if (h.field_c > mb.field_f) {
                        L6: {
                          mb.field_f = mb.field_f + 1;
                          if (mb.field_f <= h.field_b) {
                            break L6;
                          } else {
                            L7: {
                              if (null == nl.field_f) {
                                break L7;
                              } else {
                                if (null == nl.field_f[ue.field_a]) {
                                  break L7;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            mb.field_f = mb.field_f - 1;
                            break L5;
                          }
                        }
                        if (h.field_c > mb.field_f) {
                          break L5;
                        } else {
                          if (null != nl.field_f[(1 + ue.field_a) % var2_int]) {
                            break L5;
                          } else {
                            mb.field_f = mb.field_f - 1;
                            break L5;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    L8: {
                      if (mb.field_f >= h.field_c) {
                        L9: {
                          rd.field_f = ue.field_a;
                          if (!ve.field_t) {
                            ue.field_a = ue.field_a - 1;
                            if (0 > ue.field_a) {
                              ue.field_a = ue.field_a + var2_int;
                              break L9;
                            } else {
                              break L9;
                            }
                          } else {
                            ue.field_a = ue.field_a + 1;
                            if (ue.field_a < var2_int) {
                              break L9;
                            } else {
                              ue.field_a = ue.field_a - var2_int;
                              break L9;
                            }
                          }
                        }
                        mb.field_f = mb.field_f - h.field_c;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (mb.field_f <= h.field_b) {
                      break L4;
                    } else {
                      ve.field_t = true;
                      break L4;
                    }
                  }
                }
                L10: {
                  if (qk.field_H == null) {
                    break L10;
                  } else {
                    L11: {
                      var3 = 357 + -(qk.field_H.field_o / 2);
                      var4 = 0;
                      if (pj.field_v == 0) {
                        break L11;
                      } else {
                        if (var3 >= dp.field_h) {
                          break L11;
                        } else {
                          if (var3 + qk.field_H.field_u > dp.field_h) {
                            L12: {
                              if (to.field_a <= 269 - qk.field_H.field_l) {
                                break L12;
                              } else {
                                if (269 <= to.field_a) {
                                  break L12;
                                } else {
                                  var4 = 1;
                                  ve.field_t = false;
                                  mb.field_f = h.field_c;
                                  break L12;
                                }
                              }
                            }
                            if (-587 <= (to.field_a ^ -1)) {
                              break L11;
                            } else {
                              if (qk.field_H.field_l + 586 > to.field_a) {
                                var4 = 1;
                                ve.field_t = true;
                                mb.field_f = h.field_c;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L10;
                    } else {
                      if (h.field_b >= mb.field_f) {
                        break L10;
                      } else {
                        if (var3 >= bm.field_h) {
                          break L10;
                        } else {
                          if (bm.field_h >= qk.field_H.field_u + var3) {
                            break L10;
                          } else {
                            L13: {
                              if (-qk.field_H.field_l + 269 >= qh.field_i) {
                                break L13;
                              } else {
                                if (qh.field_i >= 269) {
                                  break L13;
                                } else {
                                  mb.field_f = h.field_b;
                                  break L13;
                                }
                              }
                            }
                            if (qh.field_i <= 586) {
                              break L10;
                            } else {
                              if (qh.field_i < 586 - -qk.field_H.field_l) {
                                mb.field_f = h.field_b;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L14: {
                  if (!param0) {
                    break L14;
                  } else {
                    L15: {
                      bc.field_f.a(0, og.a(0, dp.field_h, to.field_a), og.a(0, bm.field_h, qh.field_i));
                      if (!bc.field_f.a(true)) {
                        break L15;
                      } else {
                        if (0 != bc.field_f.field_c) {
                          if (bc.field_f.field_c != 1) {
                            break L15;
                          } else {
                            stackOut_61_0 = 2;
                            stackIn_62_0 = stackOut_61_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        } else {
                          stackOut_58_0 = 3;
                          stackIn_59_0 = stackOut_58_0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    L16: while (true) {
                      if (!ge.b(-83)) {
                        break L14;
                      } else {
                        L17: {
                          bc.field_f.a(0, (byte) 104);
                          if (bc.field_f.a(true)) {
                            if (bc.field_f.field_c != 0) {
                              if (-2 == (bc.field_f.field_c ^ -1)) {
                                stackOut_72_0 = 1;
                                stackIn_73_0 = stackOut_72_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                break L17;
                              }
                            } else {
                              stackOut_68_0 = 3;
                              stackIn_69_0 = stackOut_68_0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          } else {
                            break L17;
                          }
                        }
                        if (pj.field_q == 13) {
                          stackOut_76_0 = 1;
                          stackIn_77_0 = stackOut_76_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          continue L16;
                        }
                      }
                    }
                  }
                }
                stackOut_78_0 = 0;
                stackIn_79_0 = stackOut_78_0;
                decompiledRegionSelector0 = 5;
                break L0;
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
          throw dn.a((Throwable) ((Object) var2), "da.AA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_59_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_62_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_69_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_73_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_77_0;
                } else {
                  return stackIn_79_0;
                }
              }
            }
          }
        }
    }

    final void a(boolean param0) {
        int discarded$1 = 0;
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
        if (!this.field_k) {
          this.field_n.f(-116);
          this.field_n.c((byte) 111);
          this.field_n.a((byte) 20, this.field_r);
          if (this.field_f) {
            L0: {
              if (-1 <= (co.field_x ^ -1)) {
                break L0;
              } else {
                co.field_x = co.field_x - 1;
                break L0;
              }
            }
            L1: {
              if (0 == co.field_x) {
                rl.a((byte) 26, this.field_r, this.field_e);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            L2: {
              if (!this.field_l) {
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
                this.field_n.c(2, 40, 180);
                if (40 > this.field_n.field_f) {
                  return;
                } else {
                  if (!this.field_q) {
                    rk.a(0);
                    this.field_b.a(-1, true, -1);
                    this.field_q = true;
                    return;
                  } else {
                    this.field_q = false;
                    this.field_l = false;
                    if (rc.a(-71)) {
                      break L2;
                    } else {
                      this.b(false);
                      break L2;
                    }
                  }
                }
              }
            }
            L4: {
              if (-21 >= (co.field_x ^ -1)) {
                break L4;
              } else {
                co.field_x = co.field_x + 1;
                break L4;
              }
            }
            L5: {
              this.field_n.c(-1);
              if (!this.field_b.g(-1)) {
                this.field_j = this.field_j + 3 * of.field_H;
                this.e(17832);
                L6: while (true) {
                  if (!ge.b(-35)) {
                    break L5;
                  } else {
                    L7: {
                      if (pj.field_q == 80) {
                        L8: {
                          L9: {
                            if (this.field_m <= this.field_b.field_c) {
                              break L9;
                            } else {
                              if ((this.field_e ^ -1) <= -1) {
                                L10: {
                                  if (0 > this.field_e) {
                                    break L10;
                                  } else {
                                    if (this.f(this.field_e, 32)) {
                                      this.field_b.field_c = this.field_m;
                                      break L8;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                if (rc.a(-69)) {
                                  this.field_b.field_c = 1 + this.field_m;
                                  break L8;
                                } else {
                                  this.field_b.field_c = 2 + this.field_m;
                                  break L8;
                                }
                              } else {
                                break L9;
                              }
                            }
                          }
                          L11: {
                            if ((this.field_e ^ -1) <= -1) {
                              break L11;
                            } else {
                              L12: {
                                stackOut_38_0 = this;
                                stackIn_40_0 = stackOut_38_0;
                                stackIn_39_0 = stackOut_38_0;
                                if (this.field_s <= this.field_i) {
                                  stackOut_40_0 = this;
                                  stackOut_40_1 = 0;
                                  stackIn_41_0 = stackOut_40_0;
                                  stackIn_41_1 = stackOut_40_1;
                                  break L12;
                                } else {
                                  stackOut_39_0 = this;
                                  stackOut_39_1 = this.field_i;
                                  stackIn_41_0 = stackOut_39_0;
                                  stackIn_41_1 = stackOut_39_1;
                                  break L12;
                                }
                              }
                              ((da) (this)).field_e = stackIn_41_1;
                              break L11;
                            }
                          }
                          this.d(24902);
                          this.field_b.field_c = this.field_e;
                          break L8;
                        }
                        this.field_b.field_i = false;
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
                            if (this.field_b.field_c != this.field_m - -2) {
                              if (this.field_b.field_c == this.field_m - -1) {
                                this.field_b.field_c = this.field_m;
                                break L15;
                              } else {
                                L16: {
                                  if (this.field_e >= 0) {
                                    break L16;
                                  } else {
                                    L17: {
                                      stackOut_56_0 = this;
                                      stackIn_58_0 = stackOut_56_0;
                                      stackIn_57_0 = stackOut_56_0;
                                      if (this.field_s > this.field_i) {
                                        stackOut_58_0 = this;
                                        stackOut_58_1 = this.field_i;
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
                                    ((da) (this)).field_e = stackIn_59_1;
                                    break L16;
                                  }
                                }
                                this.d(24902);
                                this.field_b.field_c = this.field_e;
                                break L15;
                              }
                            } else {
                              this.field_b.field_c = this.field_m - -1;
                              break L15;
                            }
                          }
                          L18: {
                            if (this.field_m != this.field_b.field_c) {
                              break L18;
                            } else {
                              if (-1 < (this.field_e ^ -1)) {
                                continue L14;
                              } else {
                                if (!this.f(this.field_e, 65)) {
                                  continue L14;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                          L19: {
                            if (this.field_m + 1 != this.field_b.field_c) {
                              break L19;
                            } else {
                              if (rc.a(-123)) {
                                break L19;
                              } else {
                                continue L14;
                              }
                            }
                          }
                          this.field_b.field_i = false;
                          break L13;
                        }
                      }
                    }
                    L20: {
                      if (pj.field_q == 97) {
                        L21: while (true) {
                          L22: {
                            if (this.field_b.field_c != this.field_m) {
                              if (this.field_m - -1 != this.field_b.field_c) {
                                if (this.field_m - -2 == this.field_b.field_c) {
                                  break L22;
                                } else {
                                  this.field_b.field_c = this.field_m;
                                  break L22;
                                }
                              } else {
                                this.field_b.field_c = 2 + this.field_m;
                                break L22;
                              }
                            } else {
                              this.field_b.field_c = this.field_m + 1;
                              break L22;
                            }
                          }
                          L23: {
                            if (this.field_m != this.field_b.field_c) {
                              break L23;
                            } else {
                              if (0 > this.field_e) {
                                continue L21;
                              } else {
                                if (!this.f(this.field_e, 8)) {
                                  continue L21;
                                } else {
                                  break L23;
                                }
                              }
                            }
                          }
                          L24: {
                            if (this.field_m + 1 != this.field_b.field_c) {
                              break L24;
                            } else {
                              if (!rc.a(-115)) {
                                continue L21;
                              } else {
                                break L24;
                              }
                            }
                          }
                          this.field_b.field_i = false;
                          break L20;
                        }
                      } else {
                        break L20;
                      }
                    }
                    L25: {
                      if (-99 == (pj.field_q ^ -1)) {
                        L26: while (true) {
                          L27: {
                            if (2 + this.field_m != this.field_b.field_c) {
                              if (this.field_b.field_c != this.field_m + 1) {
                                if (this.field_b.field_c == this.field_m) {
                                  L28: {
                                    if ((this.field_e ^ -1) <= -1) {
                                      break L28;
                                    } else {
                                      this.field_e = -1 + this.field_m;
                                      break L28;
                                    }
                                  }
                                  this.d(24902);
                                  this.field_b.field_c = this.field_e;
                                  break L27;
                                } else {
                                  if (0 < this.field_e) {
                                    this.field_e = this.field_e - 1;
                                    this.d(24902);
                                    this.field_b.field_c = this.field_e;
                                    break L27;
                                  } else {
                                    this.field_b.field_c = 2 + this.field_m;
                                    this.field_e = -1;
                                    break L27;
                                  }
                                }
                              } else {
                                this.field_b.field_c = this.field_m;
                                break L27;
                              }
                            } else {
                              this.field_b.field_c = 1 + this.field_m;
                              break L27;
                            }
                          }
                          L29: {
                            if (this.field_m != this.field_b.field_c) {
                              break L29;
                            } else {
                              if ((this.field_e ^ -1) > -1) {
                                continue L26;
                              } else {
                                if (!this.f(this.field_e, 20)) {
                                  continue L26;
                                } else {
                                  break L29;
                                }
                              }
                            }
                          }
                          L30: {
                            if (this.field_b.field_c != this.field_m - -1) {
                              break L30;
                            } else {
                              if (rc.a(-93)) {
                                break L30;
                              } else {
                                continue L26;
                              }
                            }
                          }
                          if (this.d(this.field_b.field_c, -1)) {
                            continue L26;
                          } else {
                            this.field_b.field_i = false;
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
                            if (this.field_b.field_c == this.field_m) {
                              this.field_b.field_c = this.field_m - -1;
                              break L33;
                            } else {
                              if (this.field_b.field_c != this.field_m + 1) {
                                L34: {
                                  if (this.field_b.field_c != 2 + this.field_m) {
                                    break L34;
                                  } else {
                                    if ((this.field_e ^ -1) <= -1) {
                                      break L33;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                if (this.field_e < this.field_m - 1) {
                                  this.field_e = this.field_e + 1;
                                  this.d(24902);
                                  this.field_b.field_c = this.field_e;
                                  break L33;
                                } else {
                                  this.field_b.field_c = this.field_m;
                                  this.field_e = -1;
                                  break L33;
                                }
                              } else {
                                this.field_b.field_c = this.field_m + 2;
                                break L33;
                              }
                            }
                          }
                          L35: {
                            if (this.field_b.field_c != this.field_m) {
                              break L35;
                            } else {
                              if ((this.field_e ^ -1) > -1) {
                                continue L32;
                              } else {
                                if (!this.f(this.field_e, 23)) {
                                  continue L32;
                                } else {
                                  break L35;
                                }
                              }
                            }
                          }
                          L36: {
                            if (this.field_b.field_c != 1 + this.field_m) {
                              break L36;
                            } else {
                              if (rc.a(-46)) {
                                break L36;
                              } else {
                                continue L32;
                              }
                            }
                          }
                          if (!this.d(this.field_b.field_c, -1)) {
                            this.field_b.field_i = false;
                            break L31;
                          } else {
                            continue L32;
                          }
                        }
                      }
                    }
                    L37: {
                      if ((pj.field_q ^ -1) != -105) {
                        break L37;
                      } else {
                        L38: {
                          if (this.field_e < 0) {
                            this.field_e = this.field_j;
                            break L38;
                          } else {
                            break L38;
                          }
                        }
                        L39: {
                          this.field_e = this.field_e - 7;
                          if (-1 >= (this.field_e ^ -1)) {
                            break L39;
                          } else {
                            this.field_e = 0;
                            break L39;
                          }
                        }
                        this.c(-62);
                        this.d(24902);
                        this.field_b.field_i = false;
                        this.field_b.field_c = this.field_e;
                        break L37;
                      }
                    }
                    L40: {
                      if (-106 == (pj.field_q ^ -1)) {
                        L41: {
                          if (0 <= this.field_e) {
                            break L41;
                          } else {
                            this.field_e = this.field_j;
                            break L41;
                          }
                        }
                        L42: {
                          this.field_e = this.field_e + 7;
                          if (-1 + this.field_m < this.field_e) {
                            this.field_e = -1 + this.field_m;
                            break L42;
                          } else {
                            break L42;
                          }
                        }
                        this.f(-101);
                        this.d(24902);
                        this.field_b.field_c = this.field_e;
                        this.field_b.field_i = false;
                        break L40;
                      } else {
                        break L40;
                      }
                    }
                    L43: {
                      if (pj.field_q == 102) {
                        this.field_e = 0;
                        this.d(24902);
                        this.field_b.field_i = false;
                        this.field_b.field_c = this.field_e;
                        break L43;
                      } else {
                        break L43;
                      }
                    }
                    L44: {
                      if (103 == pj.field_q) {
                        this.field_e = this.field_m + -1;
                        this.f(116);
                        this.d(24902);
                        this.field_b.field_c = this.field_e;
                        this.field_b.field_i = false;
                        break L44;
                      } else {
                        break L44;
                      }
                    }
                    L45: {
                      L46: {
                        if ((pj.field_q ^ -1) == -85) {
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
                        this.field_b.field_i = false;
                        if (this.field_m + 1 != this.field_b.field_c) {
                          break L47;
                        } else {
                          if (rc.a(-52)) {
                            this.field_l = true;
                            return;
                          } else {
                            break L47;
                          }
                        }
                      }
                      if (this.field_b.field_c != this.field_m + 2) {
                        if (this.field_e < 0) {
                          break L45;
                        } else {
                          if (!this.f(this.field_e, 119)) {
                            break L45;
                          } else {
                            this.field_f = true;
                            return;
                          }
                        }
                      } else {
                        this.field_k = true;
                        return;
                      }
                    }
                    if (pj.field_q != 13) {
                      continue L6;
                    } else {
                      this.field_b.field_i = false;
                      this.field_k = true;
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
              if (this.field_d.length <= var4) {
                this.field_b.a(0, var3, var2);
                if (!this.a(117)) {
                  L49: {
                    var7 = 0;
                    var4 = var7;
                    if (!param0) {
                      break L49;
                    } else {
                      discarded$1 = this.c((byte) 35);
                      break L49;
                    }
                  }
                  L50: while (true) {
                    if (this.field_m <= var7) {
                      return;
                    } else {
                      var5 = this.b(var7, -19);
                      if (var5 < this.field_d[var7].field_d) {
                        this.field_d[var7].field_d = this.field_d[var7].field_d + (var5 - this.field_d[var7].field_d >> -1604438365);
                        var7++;
                        continue L50;
                      } else {
                        this.field_d[var7].field_d = this.field_d[var7].field_d - (-var5 + this.field_d[var7].field_d >> 1220392003);
                        var7++;
                        continue L50;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                if (this.field_d[var4] != null) {
                  L51: {
                    if (var4 != this.field_m) {
                      break L51;
                    } else {
                      if (0 <= this.field_e) {
                        if (this.f(this.field_e, 46)) {
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
                    if (this.field_d[var4].b(0)) {
                      var2 = var4;
                      break L52;
                    } else {
                      break L52;
                    }
                  }
                  if (this.field_d[var4].a(-85)) {
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
              a.field_b = (ue) ((Object) this.field_n);
              this.field_n.a(this.field_b.field_i, -13880);
              break L54;
            } else {
              break L54;
            }
          }
          this.field_n.a(param0);
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
            jm.field_d.a((qm) (mk.field_b), (byte) -50);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "da.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean d(int param0, int param1) {
        if (!(-2 == (this.field_r ^ -1))) {
            return false;
        }
        if (param1 != -1) {
            this.field_g = 94;
        }
        int var3 = 1 + this.field_s;
        if (!(mo.field_l != 0)) {
            if (param0 >= var3) {
                if (this.field_g > param0) {
                    return true;
                }
            }
            if (!(1 + this.field_g <= var3)) {
                var3 = 1 + this.field_g;
            }
        }
        if (var3 <= param0) {
            if (20 > param0) {
                return true;
            }
        }
        if (!(-23 >= (var3 ^ -1))) {
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
        if (var3 <= param0) {
            if (-61 < (param0 ^ -1)) {
                return true;
            }
        }
        if (60 > this.field_i) {
            if (-61 >= (param0 ^ -1)) {
                if (param0 >= this.field_m) {
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
        if (this.field_r == 1) {
          L0: {
            var2 = 1 + this.field_s;
            if (mo.field_l != 0) {
              break L0;
            } else {
              L1: {
                if (var2 > this.field_e) {
                  break L1;
                } else {
                  if (this.field_e >= this.field_g) {
                    break L1;
                  } else {
                    this.field_e = this.field_g;
                    break L1;
                  }
                }
              }
              if (var2 >= this.field_g - -1) {
                break L0;
              } else {
                var2 = 1 + this.field_g;
                break L0;
              }
            }
          }
          L2: {
            if (var2 > this.field_e) {
              break L2;
            } else {
              if (this.field_e < 20) {
                this.field_e = 20;
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if ((var2 ^ -1) <= -23) {
              if (this.field_e < var2) {
                break L3;
              } else {
                if (-41 >= (this.field_e ^ -1)) {
                  break L3;
                } else {
                  this.field_e = 40;
                  break L3;
                }
              }
            } else {
              if (this.field_e < var2) {
                break L3;
              } else {
                if (-41 >= (this.field_e ^ -1)) {
                  break L3;
                } else {
                  this.field_e = 40;
                  break L3;
                }
              }
            }
          }
          L4: {
            var3 = 91 / ((-10 - param0) / 48);
            if (-43 < (var2 ^ -1)) {
              var2 = 42;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if ((this.field_i ^ -1) > -61) {
              if (var2 > this.field_e) {
                break L5;
              } else {
                if (this.field_e >= this.field_m) {
                  break L5;
                } else {
                  this.field_e = -1 + var2;
                  break L5;
                }
              }
            } else {
              if (this.field_e < var2) {
                break L5;
              } else {
                if (this.field_e >= 60) {
                  break L5;
                } else {
                  this.field_e = 60;
                  break L5;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void b(boolean param0) {
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
          this.field_p = (f[][]) null;
          this.field_g = 0;
          this.field_o = -1;
          if (ol.field_z[this.field_r] != null) {
            this.field_g = ol.field_z[this.field_r].size();
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          this.field_i = ke.field_b[this.field_r];
          if (-2 != (this.field_r ^ -1)) {
            break L1;
          } else {
            if (mo.field_l == 0) {
              this.field_g = 15;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          this.field_s = 1 + this.field_i;
          if (this.field_s <= this.field_g) {
            break L2;
          } else {
            this.field_s = this.field_g;
            break L2;
          }
        }
        L3: {
          stackOut_9_0 = this;
          stackIn_11_0 = stackOut_9_0;
          stackIn_10_0 = stackOut_9_0;
          if (this.field_i < this.field_s) {
            stackOut_11_0 = this;
            stackOut_11_1 = this.field_i;
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
        ((da) (this)).field_e = stackIn_12_1;
        this.d(24902);
        this.field_b.field_c = -1;
        var9 = ol.field_z[this.field_r];
        this.field_d = new ik[5 + this.field_m];
        var3 = 0;
        L4: while (true) {
          if (this.field_m <= var3) {
            L5: {
              if (rc.a(-98)) {
                this.field_d[this.field_m] = (ik) ((Object) new mh(380, 398, 240, mh.field_m, 2));
                this.field_d[1 + this.field_m] = (ik) ((Object) new mh(380, 424, 240, si.field_a, 2));
                break L5;
              } else {
                this.field_d[this.field_m] = (ik) ((Object) new mh(380, 424, 240, mh.field_m, 2));
                break L5;
              }
            }
            this.field_d[2 + this.field_m] = (ik) ((Object) new mh(380, 450, 240, ag.field_a, 2));
            this.field_d[this.field_m + 3] = (ik) ((Object) new wd(600, 200, 30, 30, param0));
            this.field_d[4 + this.field_m] = (ik) ((Object) new wd(600, 250, 30, 30, true));
            return;
          } else {
            L6: {
              var4 = sm.field_h;
              if (this.f(var3, 4)) {
                L7: {
                  var10 = (kb) (var9.elementAt(var3));
                  var11 = var10.field_e;
                  var4 = var11;
                  var4 = var11;
                  var4 = var11;
                  if (this.field_i != var3) {
                    break L7;
                  } else {
                    var4 = var11 + mf.field_r;
                    break L7;
                  }
                }
                if (this.field_i < var3) {
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
              if (var3 < this.field_g) {
                break L8;
              } else {
                L9: {
                  if (1 != this.field_r) {
                    break L9;
                  } else {
                    if (-21 == (var3 ^ -1)) {
                      break L8;
                    } else {
                      if ((var3 ^ -1) == -41) {
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
              var6 = this.a(var12, var3, 20);
              var7 = var6;
              var7 = var6;
              var7 = null;
              if ((this.field_r ^ -1) != -2) {
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
                  if ((var3 ^ -1) == -21) {
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
            this.field_d[var3] = (ik) ((Object) new an(-go.field_l.a(var12) + 410, this.b(var3, -15), var6 + var4, 0, var7));
            var3++;
            continue L4;
          }
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ik stackIn_36_0 = null;
        ik stackIn_37_0 = null;
        ik stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        ik stackOut_35_0 = null;
        ik stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        ik stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        L0: {
          var6 = CrazyCrystals.field_B;
          if (param1 == 22370) {
            break L0;
          } else {
            this.e(-89);
            break L0;
          }
        }
        var4 = param0;
        L1: while (true) {
          if (var4 >= param2) {
            return;
          } else {
            if (null != this.field_d[var4]) {
              L2: {
                if (this.field_m != var4) {
                  break L2;
                } else {
                  if (-1 >= (this.field_e ^ -1)) {
                    if (this.f(this.field_e, 42)) {
                      break L2;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
              L3: {
                if (var4 != this.field_m + 3) {
                  break L3;
                } else {
                  if (13 < this.field_m) {
                    if (6 < this.field_j) {
                      break L3;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
              L4: {
                if (var4 != 4 + this.field_m) {
                  break L4;
                } else {
                  if (this.field_m > 13) {
                    if (this.field_j < this.c((byte) -90)) {
                      break L4;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
              L5: {
                var5 = 8438015;
                if (this.field_m <= var4) {
                  var5 = 12640511;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var4 < this.field_g) {
                  break L6;
                } else {
                  if (this.field_m <= var4) {
                    break L6;
                  } else {
                    L7: {
                      if (this.field_r != 1) {
                        break L7;
                      } else {
                        if (20 == var4) {
                          break L6;
                        } else {
                          if (-41 == (var4 ^ -1)) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    var5 = 16760896;
                    break L6;
                  }
                }
              }
              L8: {
                L9: {
                  if (var4 == this.field_b.field_c) {
                    break L9;
                  } else {
                    if (var4 == this.field_e) {
                      break L9;
                    } else {
                      break L8;
                    }
                  }
                }
                var5 = 16777215;
                break L8;
              }
              L10: {
                stackOut_35_0 = this.field_d[var4];
                stackIn_37_0 = stackOut_35_0;
                stackIn_36_0 = stackOut_35_0;
                if (16777215 != var5) {
                  stackOut_37_0 = (ik) ((Object) stackIn_37_0);
                  stackOut_37_1 = 0;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  break L10;
                } else {
                  stackOut_36_0 = (ik) ((Object) stackIn_36_0);
                  stackOut_36_1 = 1;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  break L10;
                }
              }
              ((ik) (Object) stackIn_38_0).a(stackIn_38_1 != 0, var5, 1);
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        L0: {
          var2 = this.c((byte) -99);
          if (-7 < (this.field_j ^ -1)) {
            this.field_j = 6;
            break L0;
          } else {
            if (var2 >= this.field_j) {
              break L0;
            } else {
              this.field_j = var2;
              break L0;
            }
          }
        }
        L1: {
          if (param0 == 17832) {
            break L1;
          } else {
            this.a(true);
            break L1;
          }
        }
    }

    static {
    }
}
