/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ck extends le {
    private fn field_j;
    static vn field_i;
    private fn field_r;
    private int field_q;
    int field_o;
    private int field_p;
    private int field_m;
    static int field_n;
    private oj[] field_s;
    private vo field_l;
    private boolean field_h;
    private int field_k;

    final void a(wk param0, byte param1) {
        int var11 = 0;
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        oj[] var10 = null;
        oj var12 = null;
        int var13 = 0;
        int var6Lifetime1;
        var13 = ZombieDawn.field_J;
        try {
          var3_int = param0.a(this.field_k, (byte) -91);
          var4 = param0.a(this.field_p, 0);
          if (param1 != 110) {
            ck.d(-107);
          }
          if (null == this.field_j &&
            this.field_r == null) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = pj.a(var4, param1 ^ 34, var3_int);
          }
          var5 = stackIn_7_0;
          if (this.field_j != null) {
            if (this.field_j.l()) {
              this.field_j = null;
            } else {
              this.field_j.h(var5);
            }
          }
          if (null != this.field_r) {
            if (this.field_r.l()) {
              this.field_r = null;
            } else {
              this.field_r.h(var5);
            }
          }
          if (this.field_o != 1) {
            var6 = (int)(15.0f * (float)this.field_q / (float)this.field_m);
            var7 = (int)((float)this.field_q * 128.0f / (float)this.field_m);
            if (var7 > 96) {
              stackIn_19_0 = 384 - 3 * var7;
            } else {
              stackIn_19_0 = var7;
            }
            var8 = stackIn_19_0;
            var9 = -var7 + 128 >> 1;
            if (var9 > 32) {
              var9 = 32;
            }
            var10 = this.field_s;
            for (var11 = 0; var11 < var10.length; var11++) {
              var12 = var10[var11];
              var12.a(tc.field_z[var6], var8, var4, var9, -124, var3_int);
            }
            return;
          }
          var6Lifetime1 = this.field_m / 2;
          if (var6Lifetime1 > this.field_m - this.field_q) {
            om.a(-1, var4, var3_int, 1, -this.field_q + this.field_m, this.field_m - this.field_q, this.field_q, this.field_q * 3 / 4);
          } else {
            om.a(-1, var4, var3_int, 1, 255, var6Lifetime1, this.field_q, this.field_q * 3 / 4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("ck.A(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean c(int param0) {
        if (param0 != -6376) {
          return false;
        }
        return null != cn.field_b ? true : mp.field_c;
    }

    final static boolean a(byte param0, int param1) {
        try {
          if (param1 <= fj.field_g.field_j) {
            return true;
          }
          if (null == sn.field_c) {
            return false;
          }
          int var2_int = sn.field_c.b((byte) -109);
          if (var2_int > 0) {
            if (-fj.field_g.field_j + param1 < var2_int) {
              var2_int = -fj.field_g.field_j + param1;
            }
            sn.field_c.a(fj.field_g.field_j, var2_int, fj.field_g.field_h, 0);
            pi.field_i = pd.a(-22826);
            fj.field_g.field_j = fj.field_g.field_j + var2_int;
            if (!(fj.field_g.field_j >= param1)) {
              return false;
            }
            fj.field_g.field_j = 0;
            return true;
          }
          try {
            if (false) throw (IOException) null;
            int var3 = -18 / ((-59 - param0) / 40);
            if (var2_int >= 0 &&
              gd.a(-124) <= 30000L) {
              return false;
            }
            p.a(1);
          } catch (IOException iOException) {
            p.a(1);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(int param0) {
        if (param0 != 1) {
          ck.a((byte) 69, 71);
        }
        field_i = null;
    }

    final void a(int param0) {
        int stackIn_9_1 = 0;
        int stackIn_10_2 = 0;
        int var2;
        int var3_int;
        le var3;
        le var4;
        fb var5;
        int var6;
        int var7;
        int var8;
        oj[] var9;
        oj var10;
        var8 = ZombieDawn.field_J;
        var9 = this.field_s;
        var3_int = 0;
        if (param0 != -11367) {
          this.field_q = -5;
        }
        while (var9.length > var3_int) {
          var10 = var9[var3_int];
          var10.a(this.field_p, 18463, this.field_k);
          var3_int++;
        }
        if (this.field_r != null &&
          this.field_r.l()) {
          this.field_r = null;
        }
        stackIn_9_1 = this.field_q;
        if (this.field_o != 1) {
          stackIn_10_2 = 6;
        } else {
          stackIn_10_2 = 3;
        }
        this.field_q = stackIn_9_1 + stackIn_10_2;
        if (this.field_q > this.field_m) {
          if (this.field_h) {
            dj.field_e.b(true);
            ck.a(-7, 6836);
          } else {
            ck.a(-5, 6836);
          }
          this.b(param0 ^ 18347);
        }
        var2 = this.field_q * this.field_q;
        var3 = this.field_l.b((byte) 26);
        while (var3 instanceof s) {
          var4 = var3.field_b;
          if (((s) (var3)).field_i < var2) {
            var3.b(-27598);
            var5 = ((s) (var3)).field_h;
            if (!(var5 instanceof kd)) {
              if (var5 instanceof ah) {
                ((ah) (var5)).c(this.field_k, 45, this.field_p);
              } else {
                if (var5 instanceof id &&
                  ((id) (var5)).a(true, false)) {
                  var6 = var5.a(true) / 24;
                  var7 = var5.f(237239984) / 24;
                  if (var5.f(237239984) % 24 == 0) {
                    var7--;
                  }
                  dj.field_e.field_H.field_A.field_f[var7][var6] = eg.a(dj.field_e.field_H.field_A.field_f[var7][var6], -33554433);
                  dj.field_e.field_H.field_A.field_f[var7 - 1][var6] = eg.a(dj.field_e.field_H.field_A.field_f[var7 - 1][var6], -33554433);
                  dj.field_e.field_H.field_A.a(true, param0 + 25732, var7, false, var6);
                  dj.field_e.field_H.field_A.a(true, 14365, var7 - 1, false, var6);
                  this.field_h = true;
                  if (null != this.field_r) {
                    pc.a((byte) 13, this.field_r);
                  }
                  this.field_r = kh.a(pb.a(so.field_a, 2, 1) + 64, false);
                }
              }
            } else {
              if (this.field_o == 1) {
                ((kd) (var5)).c(401408, this.field_p, this.field_k);
              } else {
                ((kd) (var5)).z(0);
              }
            }
          }
          var3 = var4;
        }
    }

    final static void a(int param0, int param1) {
        int var3;
        var3 = ZombieDawn.field_J;
        if (param1 != 6836) {
          ck.d(20);
        }
        if (param0 == -2) {
          nm.field_b = false;
        }
        boolean decompiledFrameRemainder0 = true;
        if (param0 == -8 &&
          !h.field_d && (vk.field_c == 7 &&
          vf.field_f == 3 ||
          vk.field_c == 7 &&
          vf.field_f == 4 ||
          vk.field_c == 6 &&
          0 == vf.field_f ||
          vk.field_c == 6 &&
          vf.field_f == 1 ||
          vk.field_c == 6 &&
          vf.field_f == 5)) {
          bo.a(97, -2);
          h.field_d = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          if (param0 == -11 &&
            !ul.field_f) {
            bo.a(47, -3);
            ul.field_f = true;
          } else {
            if (0 == vk.field_c) {
              if (vf.field_f == 0) {
                if (sm.field_a == -1 &&
                  -1 == param0) {
                  bo.a(param1 ^ 6880, 0);
                } else {
                  if (0 == sm.field_a &&
                    param0 == -3) {
                    bo.a(param1 ^ -6864, sm.field_a + 1);
                  } else {
                    if (sm.field_a == 1 &&
                      param0 == -4) {
                      bo.a(-82, 1 + sm.field_a);
                    } else {
                      if (sm.field_a == 2 &&
                        param0 == -4) {
                        bo.a(100, sm.field_a + 1);
                      }
                    }
                  }
                }
              } else {
                if (vf.field_f != 1) {
                  if (vf.field_f == 2) {
                    if (sm.field_a == -1 &&
                      param0 == -1) {
                      bo.a(param1 ^ 6831, 0);
                    } else {
                      if (0 == sm.field_a &&
                        param0 == 4) {
                        bo.a(-72, 1);
                      } else {
                        if (sm.field_a == 1 &&
                          -7 == param0) {
                          bo.a(-72, 2);
                        } else {
                          if (sm.field_a == 1 &&
                            param0 == -5) {
                            bo.a(-62, 3);
                          }
                        }
                      }
                    }
                  } else {
                    if (3 == vf.field_f) {
                      if ((param0 == 0)) {
                        bo.a(param1 ^ 6862, 0);
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (vf.field_f == 4) {
                        if (sm.field_a == -1 &&
                          param0 == -1) {
                          bo.a(-107, 0);
                        } else {
                          if (param0 == 3) {
                            bo.a(-91, 1);
                          } else {
                            if ((param0 == 5)) {
                              bo.a(83, 2);
                            }
                          }
                        }
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (vf.field_f == 5) {
                          if (-1 == sm.field_a &&
                            param0 == -1) {
                            bo.a(param1 ^ 6807, 0);
                          }
                          if (sm.field_a == 0 &&
                            param0 == -7) {
                            bo.a(25, 1);
                          }
                          if (0 == sm.field_a &&
                            param0 == -5) {
                            bo.a(106, 2);
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (sm.field_a == -1 &&
                    -1 == param0) {
                    bo.a(-110, 0);
                  } else {
                    if (sm.field_a == 0 &&
                      -4 == param0) {
                      bo.a(-65, 1 + sm.field_a);
                    } else {
                      if (sm.field_a == 1 &&
                        param0 == -4) {
                        bo.a(-64, 1 + sm.field_a);
                      }
                    }
                  }
                }
              }
            } else {
              if (vk.field_c == 1) {
                if (vf.field_f == 0) {
                  if (param0 == -1) {
                    bo.a(param1 ^ -6794, 0);
                  }
                  if (param0 == -6) {
                    bo.a(param1 ^ -6907, 1);
                  }
                }
                if (vf.field_f == 1 &&
                  -1 == sm.field_a &&
                  2 == param0) {
                  bo.a(-94, 0);
                }
                if (vf.field_f == 2) {
                  if (-1 == param0) {
                    bo.a(92, 0);
                  }
                  if (sm.field_a == 0 &&
                    param0 == -4) {
                    bo.a(112, 1);
                  }
                }
                if (vf.field_f == 4) {
                  if (1 == param0) {
                    bo.a(120, 0);
                  }
                  if (param0 == 7) {
                    bo.a(63, 1);
                  }
                }
                if (((vf.field_f == 5)) &&
                  ((param0 == -1))) {
                  bo.a(100, 0);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (vk.field_c != 2) {
                  if (vk.field_c != 4) {
                    if (vk.field_c != 5) {
                      if (vk.field_c != 6) {
                        if (7 == vk.field_c) {
                          if (vf.field_f == 0) {
                            if (-1 == param0) {
                              kh.a(89, false);
                              bo.a(-72, 0);
                            }
                            if (param0 == -12 &&
                              sm.field_a == 0) {
                              bo.a(65, 1);
                            }
                            if (param0 == 13) {
                              bo.a(-113, 2);
                            }
                          } else {
                            if (vf.field_f != 2) {
                              if (vf.field_f != 3) {
                                if (vf.field_f == 5 &&
                                  -1 == param0) {
                                  bo.a(param1 ^ 6831, 0);
                                }
                              } else {
                                if (param0 == -1) {
                                  bo.a(param1 - 6724, 0);
                                }
                              }
                            } else {
                              if (-1 == param0) {
                                bo.a(-67, 0);
                              }
                            }
                          }
                        }
                      } else {
                        if (vf.field_f != 0) {
                          if (2 == vf.field_f) {
                            if (param0 == 10 &&
                              sm.field_a == -1) {
                              bo.a(78, 0);
                            }
                          } else {
                            if (vf.field_f != 3) {
                              if (((5 == vf.field_f)) &&
                                ((-1 == param0))) {
                                bo.a(-111, 0);
                              }
                              decompiledFrameRemainder0 = false;
                            }
                            else {
                              if (param0 == -1) {
                                bo.a(32, 0);
                              }
                              if (param0 == -10 &&
                                !ha.field_e) {
                                bo.a(-107, 1);
                                ha.field_e = true;
                              }
                              if (param0 == -13 &&
                                !uo.field_d) {
                                bo.a(-72, 2);
                                uo.field_d = true;
                              }
                            }
                          }
                        } else {
                          if (param0 == -1) {
                            bo.a(param1 - 6762, 0);
                          }
                          if (param0 == -9 &&
                            0 == sm.field_a) {
                            bo.a(120, 1);
                          }
                        }
                      }
                    } else {
                      if (vf.field_f != 0) {
                        if (vf.field_f == 1) {
                          if ((-1 == param0)) {
                            bo.a(-70, 0);
                          }
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          if (2 != vf.field_f) {
                            if (vf.field_f == 4 &&
                              param0 == -1) {
                              bo.a(-88, 0);
                            }
                          } else {
                            if (param0 == -1) {
                              bo.a(param1 - 6738, 0);
                            } else {
                              if (param0 == 13 &&
                                sm.field_a == 0) {
                                bo.a(-92, 1);
                              }
                            }
                          }
                        }
                      } else {
                        if (-1 == param0) {
                          bo.a(param1 ^ 6880, 0);
                        } else {
                          if (15 == param0 &&
                            sm.field_a == 0) {
                            bo.a(-100, 1);
                          } else {
                            if (param0 == 15 &&
                              sm.field_a == 1) {
                              bo.a(105, 2);
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (vf.field_f != 0) {
                      if (vf.field_f == 1) {
                        if ((param0 == 12)) {
                          bo.a(param1 - 6749, 0);
                        }
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (vf.field_f == 2) {
                          if ((param0 == 9)) {
                            bo.a(param1 - 6910, 0);
                          }
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          if (vf.field_f == 3) {
                            if (param0 == -1) {
                              bo.a(-79, 0);
                            }
                            if ((param0 == 14)) {
                              bo.a(105, 1);
                            }
                            decompiledFrameRemainder0 = false;
                          }
                          else {
                            if (vf.field_f != 4) {
                              if (vf.field_f == 5 &&
                                -1 == param0) {
                                bo.a(53, 0);
                              }
                            } else {
                              if (param0 == 9) {
                                bo.a(57, 0);
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (param0 == -1) {
                        bo.a(param1 ^ 6886, 0);
                      }
                      if (param0 == 12 &&
                        sm.field_a == 0) {
                        bo.a(-61, 1);
                      }
                    }
                  }
                } else {
                  if (vf.field_f == 5) {
                    if (param0 == -1) {
                      bo.a(-77, 0);
                    }
                    if (param0 == 3 &&
                      0 == sm.field_a) {
                      bo.a(93, 1);
                    }
                    if (param0 == 4 &&
                      1 == sm.field_a) {
                      bo.a(-75, 2);
                    }
                  }
                }
              }
            }
          }
        }

    }

    ck(int param0, int param1, int param2) {
        int var5_int = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_1 = 0;
        int var4;
        le var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var4Lifetime1;
        int var4Lifetime2;
        this.field_m = 180;
        this.field_r = null;
        this.field_j = null;
        this.field_h = false;
        if (!dj.field_e.field_H.a(param0, param1, 106)) {
          param1 = param1 - (-4 + param1 % 24);
        }
        this.field_k = param0;
        this.field_o = param2;
        this.field_p = param1;
        var4 = this.field_o;
        if (var4 == 0) {
          this.field_m = 180;
        } else {
          if (var4 == 3) {
            this.field_m = 180;
          } else {
            if (var4 == 2) {
              this.field_m = 40;
            } else {
              if (1 == var4) {
                this.field_m = 130;
              }
            }
          }
        }
        if (this.field_m != 40) {
          this.field_q = 0;
          this.field_s = new oj[75];
          for (var4Lifetime1 = 0; this.field_s.length > var4Lifetime1; var4Lifetime1++) {
            this.field_s[var4Lifetime1] = new oj(6.0f * tk.field_d[var4Lifetime1], 6.0f * tk.field_g[var4Lifetime1]);
          }
        } else {
          var4Lifetime1 = 12;
          this.field_q = 0;
          this.field_s = new oj[75 / var4Lifetime1];
          for (var5_int = 0; this.field_s.length > var5_int; var5_int++) {
            this.field_s[var5_int] = new oj(tk.field_d[var4Lifetime1 * var5_int] * 6.0f, 6.0f * tk.field_g[var5_int * var4Lifetime1]);
          }
        }
        this.field_l = new vo();
        var4Lifetime2 = this.field_m * this.field_m;
        var5 = dj.field_e.field_R.b((byte) 26);
        while (var5 instanceof fb) {
          if (var5 instanceof kd &&
            9 != ((kd) (var5)).field_F ||
            var5 instanceof id ||
            var5 instanceof ah &&
            ((ah) (var5)).field_F != 2) {
            var6 = ((fb) (var5)).a(true);
            var7 = ((fb) (var5)).f(237239984);
            var8 = -var6 + this.field_k;
            var9 = this.field_p - var7;
            var10 = var8 * var8 + var9 * var9;
            stackIn_28_0 = (var10 >= var4Lifetime2) ? 0 : 1;
            var11 = stackIn_28_0;
            if (!(var5 instanceof id)) {
              if (this.field_o != 1) {
                stackIn_39_0 = var11;
                if (dj.field_e.field_H.a(var7, this.field_p, var6, this.field_k, 124) == -1) {
                  stackIn_40_1 = 0;
                } else {
                  stackIn_40_1 = 1;
                }
                var11 = stackIn_39_0 & stackIn_40_1;
              }
            } else {
              stackIn_33_0 = var11;
              if (dj.field_e.field_H.a(-24 + var7 - 26, this.field_p, var6, this.field_k, 110) == -1 &&
                dj.field_e.field_H.a(-24 + var7 - 26, this.field_p, 24 + var6, this.field_k, 125) == -1 &&
                dj.field_e.field_H.a(var7 + 2, this.field_p, var6, this.field_k, 109) == -1 &&
                dj.field_e.field_H.a(2 + var7, this.field_p, var6 + 24, this.field_k, 111) == -1) {
                stackIn_35_1 = 0;
              } else {
                stackIn_35_1 = 1;
              }
              var11 = stackIn_33_0 & stackIn_35_1;
            }
            if (var11 != 0) {
              this.field_l.a(0, new s((fb) (var5), var10));
            }
          }
          var5 = var5.field_b;
        }
        if (this.field_o != 2) {
          this.field_j = kh.a(0, false);
        }
    }

    static {
        field_n = -1;
    }
}
