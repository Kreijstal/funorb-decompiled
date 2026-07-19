/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hq {
    static String field_m;
    static String field_o;
    bk field_h;
    private bk field_l;
    ko field_d;
    static int field_i;
    int field_n;
    static String field_f;
    private int field_k;
    static String field_e;
    private String field_g;
    hq field_j;
    private boolean field_b;
    uf field_a;
    static int field_c;

    private final void a(int param0, int param1) {
        int var3 = al.field_k.field_qb;
        int var4 = al.field_k.field_eb;
        int var5 = qh.field_l - ep.field_s.field_z >> -1361699679;
        al.field_k.field_qb = al.field_k.field_qb - var5;
        int var6 = -ep.field_s.field_A + qh.field_f;
        al.field_k.field_eb = al.field_k.field_eb - var6;
        ep.field_s.e();
        qh.d();
        this.c((byte) -109);
        al.field_k.a((byte) -79, false);
        this.field_h.a(false);
        al.field_k.field_qb = var3;
        al.field_k.field_eb = var4;
        sh.field_P.b(15100);
        qh.c(5 + al.field_k.field_qb, 5 + al.field_k.field_eb, -10 + al.field_k.field_gb, al.field_k.field_Db - param0, 0, 128 * param1 >> -725259224);
        ep.field_s.d(var5, var6, param1, param1);
    }

    final static void a(int param0, int[] param1, int[] param2, int param3, byte param4) {
        int incrementValue$1 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (param4 == 80) {
                break L1;
              } else {
                field_f = (String) null;
                break L1;
              }
            }
            L2: {
              if (param3 <= param0) {
                break L2;
              } else {
                L3: {
                  var5_int = (param0 + param3) / 2;
                  var6 = param0;
                  var7 = param1[var5_int];
                  param1[var5_int] = param1[param3];
                  param1[param3] = var7;
                  var8 = param2[var5_int];
                  param2[var5_int] = param2[param3];
                  param2[param3] = var8;
                  if (-2147483648 == (var7 ^ -1)) {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L3;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L3;
                  }
                }
                var9 = stackIn_6_0;
                var10 = param0;
                L4: while (true) {
                  if (var10 >= param3) {
                    param1[param3] = param1[var6];
                    param1[var6] = var7;
                    param2[param3] = param2[var6];
                    param2[var6] = var8;
                    hq.a(param0, param1, param2, -1 + var6, (byte) 80);
                    hq.a(1 + var6, param1, param2, param3, (byte) 80);
                    break L2;
                  } else {
                    L5: {
                      if (param1[var10] > -(var9 & var10) + var7) {
                        var11 = param1[var10];
                        param1[var10] = param1[var6];
                        param1[var6] = var11;
                        var12 = param2[var10];
                        param2[var10] = param2[var6];
                        incrementValue$1 = var6;
                        var6++;
                        param2[incrementValue$1] = var12;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var10++;
                    continue L4;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("hq.L(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          L7: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean b(int param0) {
        int var2 = -86 % ((40 - param0) / 46);
        int var3 = 0;
        if (qa.field_v.field_R != 0) {
            this.d((byte) -105);
            var3 = 1;
        } else {
            if (!(this.field_b)) {
                return false;
            }
        }
        if (0 != jq.field_d.field_R) {
            this.e((byte) 89);
            this.c(255);
            var3 = 1;
        }
        if (!(0 == pl.field_b.field_R)) {
            var3 = 1;
            this.a((byte) -87);
        }
        if (al.field_k.field_R != 0) {
            var3 = 1;
        }
        return var3 != 0;
    }

    final void a(boolean param0) {
        this.field_k = this.field_d.a(116);
        if (param0) {
            this.field_b = false;
        }
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          if (param0 == 25) {
            break L0;
          } else {
            field_o = (String) null;
            break L0;
          }
        }
        L1: {
          if (!this.field_b) {
            break L1;
          } else {
            al.field_k.a(true, false);
            break L1;
          }
        }
        L2: {
          if (!qa.field_v.b(param0 + -142)) {
            qa.field_v.a(true, false);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (ng.field_s < 0) {
            break L3;
          } else {
            var2 = this.field_l.c((byte) -111);
            var3 = this.field_h.c((byte) -122);
            al.field_k.field_Db = (var2 * (25 + -ng.field_s) + ng.field_s * var3) / 25;
            al.field_k.field_eb = -al.field_k.field_Db + qh.field_f - 5;
            this.e(1);
            ng.field_s = ng.field_s + 1;
            if (-26 > (ng.field_s ^ -1)) {
              ng.field_s = -1;
              break L3;
            } else {
              break L3;
            }
          }
        }
        L4: {
          if ((ca.field_i ^ -1) <= -1) {
            ca.field_i = ca.field_i + 1;
            if (25 >= ca.field_i) {
              break L4;
            } else {
              ca.field_i = -1;
              if (this.field_b) {
                this.e(1);
                break L4;
              } else {
                break L4;
              }
            }
          } else {
            break L4;
          }
        }
        L5: {
          L6: {
            if (-1 >= (oj.field_q ^ -1)) {
              break L6;
            } else {
              if (!nk.field_e) {
                break L5;
              } else {
                break L6;
              }
            }
          }
          oj.field_q = oj.field_q + 1;
          nj.field_c = hc.a(2047, oj.field_q * 2048 / 25) + 163840 >> -1381930646;
          if (oj.field_q < 25) {
            break L5;
          } else {
            if (nk.field_e) {
              nk.field_e = false;
              oj.field_q = 0;
              break L5;
            } else {
              oj.field_q = -1;
              nj.field_c = 256;
              break L5;
            }
          }
        }
    }

    final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        dd stackIn_21_0 = null;
        dd stackOut_20_0 = null;
        dd stackOut_19_0 = null;
        if (param0 > 24) {
          L0: {
            if (!this.field_b) {
              L1: {
                if (0 <= ca.field_i) {
                  this.a(10, (-ca.field_i + 25) * 255 / 25);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (!qa.field_v.b(-119)) {
                qa.field_v.a((byte) -79, false);
                break L0;
              } else {
                break L0;
              }
            } else {
              if ((ng.field_s ^ -1) > -1) {
                if ((ca.field_i ^ -1) > -1) {
                  qh.c(5 + al.field_k.field_qb, al.field_k.field_eb + 5, -10 + al.field_k.field_gb, al.field_k.field_Db + -10, 0, 128);
                  this.c((byte) -109);
                  al.field_k.a((byte) -79, false);
                  qa.field_v.a((byte) -79, false);
                  this.field_h.a(false);
                  break L0;
                } else {
                  this.a(10, 255 * ca.field_i / 25);
                  qa.field_v.a((byte) -79, false);
                  break L0;
                }
              } else {
                L2: {
                  qh.c(al.field_k.field_qb + 5, 5 + al.field_k.field_eb, al.field_k.field_gb + -10, -10 + al.field_k.field_Db, 0, 128);
                  this.c((byte) -109);
                  var2 = al.field_k.field_qb;
                  al.field_k.field_qb = al.field_k.field_qb - 160;
                  var3 = al.field_k.field_eb;
                  al.field_k.field_eb = al.field_k.field_eb - 240;
                  ep.field_s.e();
                  qh.d();
                  this.field_l.a(false);
                  hk.field_r.e();
                  qh.d();
                  this.c((byte) -109);
                  this.field_h.a(false);
                  var4 = -5 + (-qa.field_v.field_Db + (al.field_k.field_Db + al.field_k.field_eb));
                  var5 = al.field_k.field_eb;
                  var6 = al.field_k.field_qb + 5;
                  var7 = al.field_k.field_gb + al.field_k.field_qb - 10;
                  al.field_k.field_qb = var2;
                  al.field_k.field_eb = var3;
                  sh.field_P.b(15100);
                  al.field_k.a((byte) -79, false);
                  qa.field_v.a((byte) -79, false);
                  if (qh.field_b > var6) {
                    var6 = qh.field_b;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (qh.field_g < var4) {
                    var4 = qh.field_g;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var7 <= qh.field_j) {
                    break L4;
                  } else {
                    var7 = qh.field_j;
                    break L4;
                  }
                }
                L5: {
                  if (var5 >= qh.field_c) {
                    break L5;
                  } else {
                    var5 = qh.field_c;
                    break L5;
                  }
                }
                var8 = -var6 + (var7 + (var4 + -var5));
                var9 = var5;
                L6: while (true) {
                  if (var4 <= var9) {
                    break L0;
                  } else {
                    var10 = var6;
                    L7: while (true) {
                      if (var7 <= var10) {
                        var9++;
                        continue L6;
                      } else {
                        L8: {
                          if (ng.field_s + ga.a(5, true, ea.field_r) - 3 >= 25 * (-var6 + (var10 - var5) - -var9) / var8) {
                            stackOut_20_0 = hk.field_r;
                            stackIn_21_0 = stackOut_20_0;
                            break L8;
                          } else {
                            stackOut_19_0 = ep.field_s;
                            stackIn_21_0 = stackOut_19_0;
                            break L8;
                          }
                        }
                        var11 = stackIn_21_0.field_D[ep.field_s.field_z * var9 - -var10];
                        if (var11 != 0) {
                          qh.a(var10 + 160, 240 + var9, var11);
                          var10++;
                          continue L7;
                        } else {
                          var10++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void d(byte param0) {
        int var2 = 52 % ((7 - param0) / 41);
        if (this.field_b) {
            this.d(-128);
        } else {
            this.g(-84);
        }
    }

    private final void c(int param0) {
        if (param0 != 255) {
            this.field_d = (ko) null;
        }
        if (this.field_d.field_e != this.field_h.field_d) {
            if (this.field_h != null) {
                if (!(this.field_d.field_e == this.field_h)) {
                    ng.field_s = 0;
                    this.field_l = this.field_h;
                }
            }
            this.a((bk) ((Object) this.field_h.field_d), param0 ^ 254);
            this.g(-120);
        } else {
            if (!(null == this.field_j)) {
                this.field_j.field_l = this.field_h;
                this.field_a.a(104, this.field_a.field_I.field_h, this.field_j);
            }
        }
    }

    final static eg b(byte param0) {
        eg var1 = new eg(0, 0, 0);
        if (param0 < 120) {
            field_i = 107;
        }
        var1.c();
        return var1;
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 17924) {
                break L1;
              } else {
                hq.h(36);
                break L1;
              }
            }
            L2: {
              var3 = qa.a(param1, 0);
              if (param0.indexOf(param1) != -1) {
                break L2;
              } else {
                if (param0.indexOf(var3) != -1) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (param0.startsWith(param1)) {
                        break L4;
                      } else {
                        if (param0.startsWith(var3)) {
                          break L4;
                        } else {
                          if (param0.endsWith(param1)) {
                            break L4;
                          } else {
                            if (!param0.endsWith(var3)) {
                              stackOut_13_0 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    stackOut_12_0 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    break L3;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_6_0 = stackOut_5_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("hq.AA(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_14_0 != 0;
        }
    }

    private final void e(byte param0) {
        ij discarded$4 = null;
        boolean discarded$5 = false;
        ij discarded$6 = null;
        boolean discarded$7 = false;
        pq[] var2 = null;
        int var3 = 0;
        int var4_int = 0;
        qe var4 = null;
        int var5_int = 0;
        Object var5 = null;
        int var6 = 0;
        pq var8_ref_pq = null;
        int var8 = 0;
        int var10 = 0;
        String var12 = null;
        pq[] var13 = null;
        int var14 = 0;
        qe var15 = null;
        dl var16 = null;
        pq var17 = null;
        dl var18 = null;
        var10 = Pool.field_O;
        if (param0 >= 85) {
          L0: {
            var4_int = this.field_h.field_s;
            if ((var4_int ^ -1) != -513) {
              if (var4_int != 2048) {
                break L0;
              } else {
                L1: {
                  var12 = (String) null;
                  discarded$4 = gj.a(true, 0, kj.field_l, (String) null);
                  var13 = this.field_a.field_I.field_l;
                  var2 = var13;
                  var3 = this.field_a.field_I.field_f.a(-1);
                  if (0 == var3) {
                    break L1;
                  } else {
                    if ((var3 ^ -1) == -2) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                var4 = this.field_a.field_I.j(105);
                var5 = null;
                var14 = 0;
                var6 = var14;
                L2: while (true) {
                  if (var13.length <= var14) {
                    if (var5 == null) {
                      break L0;
                    } else {
                      this.field_a.field_I.e(-54);
                      var4.field_s = nd.field_j;
                      var4.field_n = ((cr) ((Object) ((ko) (var5)).c((byte) -64))).field_n;
                      var4.field_m = (ko) (var5);
                      var4.field_q = 2;
                      discarded$5 = this.field_a.field_I.f((byte) 117);
                      this.field_a.s((byte) -62);
                      break L0;
                    }
                  } else {
                    var17 = var13[var14];
                    if (var17.field_s) {
                      if (var3 == this.field_a.field_I.field_f.b(var14, 30554)) {
                        L3: {
                          var8 = this.field_a.field_I.a(17897, var14);
                          var18 = this.field_a.field_I.field_w[var8];
                          var17.field_g = var18.field_g;
                          var17.field_s = false;
                          var17.field_k = var18.field_f;
                          var17.field_p = true;
                          var18.a(var14, -106);
                          if (var5 == null) {
                            var5 = new ko();
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        ((ko) (var5)).b((byte) -43, new cr(var14, var8));
                        var14++;
                        continue L2;
                      } else {
                        var14++;
                        continue L2;
                      }
                    } else {
                      var14++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              if (this.field_a.field_I.field_f.a(-1) == -1) {
                var4_int = ga.a(2, true, ea.field_r);
                var5_int = ga.a(7, true, ea.field_r) - (-(var4_int << -1667503261) + -1);
                var6 = ga.a(this.field_a.field_I.field_w.length, true, ea.field_r);
                var16 = this.field_a.field_I.field_w[var6];
                var18 = var16;
                var18 = var16;
                var8_ref_pq = this.field_a.field_I.field_l[var5_int];
                var15 = this.field_a.field_I.j(75);
                discarded$6 = gj.a(true, 0, nr.a(new String[]{dq.field_a.a((byte) 92, var4_int)}, -1, vc.field_P), (String) null);
                this.field_a.field_I.e(-95);
                this.field_a.field_I.field_f.a(var4_int, -1, 0);
                var15.field_s = i.field_m | nd.field_j;
                var15.field_q = 2;
                var15.field_m = new ko();
                var15.field_m.b((byte) 105, new cr(var5_int, var6));
                var15.field_n = var5_int;
                discarded$7 = this.field_a.field_I.f((byte) 53);
                this.field_a.s((byte) -36);
                var16.a(var5_int, 69);
                var8_ref_pq.field_s = false;
                var8_ref_pq.field_k = var16.field_f;
                var8_ref_pq.field_g = var16.field_g;
                break L0;
              } else {
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, qe param1) {
        ij discarded$1 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        cr var5_ref = null;
        String var6 = null;
        af var7 = null;
        ko var8 = null;
        aa var9 = null;
        ko var10 = null;
        aa var11 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var5 = null;
        try {
          L0: {
            L1: {
              if (-257 != (this.field_h.field_s ^ -1)) {
                break L1;
              } else {
                L2: {
                  if (-1 < (param1.field_M ^ -1)) {
                    break L2;
                  } else {
                    if (2 >= pq.field_i.a((byte) 2)) {
                      break L2;
                    } else {
                      this.b(1, 8, -28186);
                      break L1;
                    }
                  }
                }
                this.field_a.n(0);
                var6 = (String) null;
                discarded$1 = gj.a(true, 0, ec.field_k, (String) null);
                break L1;
              }
            }
            L3: {
              if (this.field_h.field_s != 512) {
                break L3;
              } else {
                if (0 == (param1.field_s & i.field_m)) {
                  break L3;
                } else {
                  this.b(1, 9, -28186);
                  break L3;
                }
              }
            }
            L4: {
              if (2048 != this.field_h.field_s) {
                break L4;
              } else {
                if (!(this.field_a.field_I.field_f instanceof af)) {
                  break L4;
                } else {
                  L5: {
                    var7 = (af) ((Object) this.field_a.field_I.field_f);
                    var4 = var7.f(22533, 0);
                    if (var4 == 0) {
                      break L5;
                    } else {
                      if ((var4 ^ -1) != -2) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  this.field_h.field_u = var7.e(var4, 125);
                  if (this.field_h.field_u >= 7) {
                    this.c(255);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            }
            L6: {
              if ((this.field_h.field_s ^ -1) != -4097) {
                break L6;
              } else {
                if (param1.a((byte) -122, 8)) {
                  this.b(1, 12, -28186);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            if (!param0) {
              L7: {
                if ((this.field_h.field_s ^ -1) != -32769) {
                  break L7;
                } else {
                  var8 = param1.field_m;
                  if (var8 == null) {
                    break L7;
                  } else {
                    var9 = new aa(var8);
                    var5_ref = (cr) ((Object) var9.b((byte) -92));
                    L8: while (true) {
                      if (var5_ref == null) {
                        break L7;
                      } else {
                        L9: {
                          if (0 == var5_ref.field_n) {
                            break L9;
                          } else {
                            this.b(1, 15, -28186);
                            break L9;
                          }
                        }
                        if ((var5_ref.field_n ^ -1) == -10) {
                          this.b(1, 16, -28186);
                          break L7;
                        } else {
                          var5_ref = (cr) ((Object) var9.b(-121));
                          continue L8;
                        }
                      }
                    }
                  }
                }
              }
              L10: {
                if (-65537 != (this.field_h.field_s ^ -1)) {
                  break L10;
                } else {
                  var10 = param1.field_m;
                  if (var10 != null) {
                    var11 = new aa(var10);
                    var5_ref = (cr) ((Object) var11.b((byte) -92));
                    L11: while (true) {
                      if (var5_ref == null) {
                        break L10;
                      } else {
                        if (9 == var5_ref.field_n) {
                          this.b(1, 16, -28186);
                          break L10;
                        } else {
                          var5_ref = (cr) ((Object) var11.b(-114));
                          continue L11;
                        }
                      }
                    }
                  } else {
                    break L10;
                  }
                }
              }
              L12: {
                if (this.field_h.field_s != 16384) {
                  break L12;
                } else {
                  if (param1.field_z != this.field_a.field_I.field_f.b(param1.field_n, 30554)) {
                    break L12;
                  } else {
                    this.b(1, 14, -28186);
                    break L12;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) (var3);
            stackOut_46_1 = new StringBuilder().append("hq.W(").append(param0).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param1 == null) {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L13;
            } else {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L13;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void c(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        bk var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        aa var23 = null;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int[] stackOut_16_0 = null;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        var23 = new aa(this.field_d);
        var3 = 0;
        var4 = al.field_k.field_qb - -qg.field_b.field_G;
        var5 = al.field_k.field_Db + (al.field_k.field_eb + (-al.field_k.field_F[7].field_A + -al.field_k.field_F[4].field_A) + (-al.field_k.field_F[1].field_A - -qg.field_b.field_B));
        var6 = var5 - -qg.field_b.field_A;
        var7 = (bk) ((Object) var23.b((byte) -92));
        L0: while (true) {
          if (this.field_d.field_e == var7.field_d) {
            L1: {
              if (param0 == -109) {
                break L1;
              } else {
                this.d(-29);
                break L1;
              }
            }
            return;
          } else {
            L2: {
              var8 = (var3 - -1) * (-qg.field_b.field_G + qg.field_b.field_w) / (this.field_k + -1) + qg.field_b.field_G + al.field_k.field_qb;
              var9 = var4;
              if (var9 < qh.field_b) {
                var9 = qh.field_b;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var10 = var8;
              if (qh.field_j < var10) {
                var10 = qh.field_j;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var11 = var5;
              if (qh.field_c > var11) {
                var11 = qh.field_c;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var12 = var6;
              if (var12 > qh.field_g) {
                var12 = qh.field_g;
                break L5;
              } else {
                break L5;
              }
            }
            var13 = var11;
            L6: while (true) {
              if (var13 >= var12) {
                var3++;
                var4 = var8;
                var7 = (bk) ((Object) var23.b(param0 ^ 61));
                continue L0;
              } else {
                L7: {
                  var14 = var13 + -var5;
                  stackOut_16_0 = qg.field_b.field_D;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  if (this.field_h != var7) {
                    stackOut_18_0 = (int[]) ((Object) stackIn_18_0);
                    stackOut_18_1 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    break L7;
                  } else {
                    stackOut_17_0 = (int[]) ((Object) stackIn_17_0);
                    stackOut_17_1 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    break L7;
                  }
                }
                var15 = stackIn_19_0[stackIn_19_1 + qg.field_b.field_z * (var13 + -var5)];
                var16 = qg.field_b.field_D[qg.field_b.field_z * (var13 + -var5) - -2];
                var17 = var9;
                L8: while (true) {
                  if (var17 >= var10) {
                    var13++;
                    continue L6;
                  } else {
                    L9: {
                      if (var9 == var17) {
                        var21 = var15 >> -1762059448 & 255;
                        var20 = 255 & var15 >> -34883728;
                        var20 = 255 & var20 - -(255 + -var20 >> 431118946);
                        var21 = 255 & var21 + (-var21 + 255 >> 1326160322);
                        var22 = 255 & var15;
                        var22 = var22 + (-var22 + 255 >> 1367104738) & 255;
                        var18 = var21 << -1748266776 | var20 << 92060944 | var22;
                        var21 = (var16 & 65303) >> -183211704;
                        var20 = var16 >> -1957126992 & 255;
                        var22 = var16 & 255;
                        var20 = (-var20 + 255 >> 60510562) + var20 & 255;
                        var22 = (-var22 + 255 >> 1241583138) + var22 & 255;
                        var21 = (-var21 + 255 >> 1027098114) + var21 & 255;
                        var19 = var22 | (var21 << -1053423832 | var20 << 871788496);
                        break L9;
                      } else {
                        if (-1 + var10 != var17) {
                          var18 = var15;
                          var19 = var16;
                          break L9;
                        } else {
                          var18 = var15 >> 1485516161 & 8355711;
                          var19 = 8355711 & var16 >> -1180430207;
                          break L9;
                        }
                      }
                    }
                    var20 = var17 - var4;
                    if (var14 + var20 >= var7.field_u * (-var4 + (var8 + qg.field_b.field_A)) / var7.field_l) {
                      qh.field_d[qh.field_l * var13 + var17] = var18;
                      var17++;
                      continue L8;
                    } else {
                      if (this.field_h == var7) {
                        qh.field_d[qh.field_l * var13 - -var17] = md.a(md.a(rb.b(16711898, (-nj.field_c + 256) * (rb.b(16744119, var18) >> 737833776) + (rb.b(var19, 16714394) >> 1627308528) * nj.field_c << 390661992), rb.b((256 - nj.field_c) * rb.b(var18 >> -161023256, 255) + (rb.b(65295, var19) >> 2116258632) * nj.field_c, 65280)), rb.b(nj.field_c * rb.b(var19, 255) - -((256 - nj.field_c) * rb.b(var18, 255)) >> 859100712, 255));
                        var17++;
                        continue L8;
                      } else {
                        if (var7.field_u > var7.field_l) {
                          qh.field_d[var17 + qh.field_l * var13] = var18;
                          var17++;
                          continue L8;
                        } else {
                          qh.field_d[var17 + qh.field_l * var13] = var19;
                          var17++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void d(int param0) {
        if (!this.field_b) {
        } else {
            qa.field_v.field_G = vm.field_d[13];
            this.field_b = false;
            qa.field_v.field_ab = vm.field_d[1];
            qa.field_v.field_xb = vm.field_d[9];
            qa.field_v.field_hb = vm.field_d[5];
            if (0 == (ca.field_i ^ -1)) {
                ca.field_i = 0;
            } else {
                ca.field_i = 25 - ca.field_i;
            }
        }
        if (param0 > -121) {
            this.a(113, -115);
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 == param0) {
            if (!(!bo.a(param1, (byte) 43))) {
                return 29;
            }
        }
        return kb.field_d[param0];
    }

    final void a(int param0) {
        aa var4 = new aa(this.field_d);
        bk var3 = (bk) ((Object) var4.b((byte) -92));
        while (var3 != null) {
            var3.field_u = 0;
            var3 = (bk) ((Object) var4.b(param0 + -98));
        }
        this.a((bk) ((Object) this.field_d.c((byte) 109)), 1);
        this.g(-94);
        al.field_k.field_Db = null == this.field_h ? 10 : this.field_h.c((byte) -112);
        al.field_k.field_eb = -5 + -al.field_k.field_Db + qh.field_f;
        this.e(1);
        this.field_a.n(0);
        if (param0 != -1) {
            this.c(127);
        }
        this.field_a.field_I.a(this.field_n, (byte) -118);
        this.field_a.field_G.field_h = 0;
        this.field_a.E(-24070);
        ij discarded$0 = gj.a(true, 0, this.field_g, ke.field_a);
    }

    final static void h(int param0) {
        if (param0 != -29322) {
            field_c = -7;
        }
        int var1 = ee.b((byte) -62);
        int var2 = hl.a(23467);
        Pool.field_I.a(var1 - -(bk.field_v << -598127359), -ld.field_b + uh.field_n, -6316, -bk.field_v + fk.field_Z, (ld.field_b << 1275992257) + var2);
        e.a(param0 ^ 29411);
    }

    final static String a(int param0, byte param1, CharSequence[] param2, int param3) {
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        StringBuilder var7 = null;
        CharSequence var8_ref_CharSequence = null;
        int var8 = 0;
        CharSequence var9 = null;
        int var10 = 0;
        CharSequence var11 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_7_0 = null;
        String stackOut_23_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var10 = Pool.field_O;
        try {
          L0: {
            if (param3 != 0) {
              if ((param3 ^ -1) == -2) {
                var11 = param2[param0];
                var4 = var11;
                if (var4 != null) {
                  stackOut_9_0 = var11.toString();
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_7_0 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var5 = -47 % ((-50 - param1) / 56);
                var4_int = param0 + param3;
                var6 = 0;
                var7_int = param0;
                L1: while (true) {
                  if (var4_int <= var7_int) {
                    var7 = new StringBuilder(var6);
                    var8 = param0;
                    L2: while (true) {
                      if (var4_int <= var8) {
                        stackOut_23_0 = var7.toString();
                        stackIn_24_0 = stackOut_23_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L3: {
                          var9 = param2[var8];
                          if (var9 == null) {
                            discarded$5 = var7.append("null");
                            break L3;
                          } else {
                            discarded$6 = var7.append(var9);
                            break L3;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    L4: {
                      var8_ref_CharSequence = param2[var7_int];
                      if (var8_ref_CharSequence != null) {
                        var6 = var6 + var8_ref_CharSequence.length();
                        break L4;
                      } else {
                        var6 += 4;
                        break L4;
                      }
                    }
                    var7_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = "";
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var4_ref);
            stackOut_25_1 = new StringBuilder().append("hq.Q(").append(param0).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_24_0;
            }
          }
        }
    }

    final static String a(int param0, CharSequence param1) {
        String discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        Object stackIn_2_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_28_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_29_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            if (param1 != null) {
              var2_int = 0;
              var3 = param1.length();
              L1: while (true) {
                L2: {
                  if (var3 <= var2_int) {
                    break L2;
                  } else {
                    if (!qd.a(0, param1.charAt(var2_int))) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var3 <= var2_int) {
                      break L4;
                    } else {
                      if (!qd.a(0, param1.charAt(var3 - 1))) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  L5: {
                    if (param0 >= 59) {
                      break L5;
                    } else {
                      var9 = (CharSequence) null;
                      discarded$2 = hq.a(53, (CharSequence) null);
                      break L5;
                    }
                  }
                  var4 = -var2_int + var3;
                  if (1 <= var4) {
                    if (var4 <= 12) {
                      var5 = new StringBuilder(var4);
                      var6 = var2_int;
                      L6: while (true) {
                        if (var6 >= var3) {
                          if (-1 != (var5.length() ^ -1)) {
                            stackOut_29_0 = var5.toString();
                            stackIn_30_0 = stackOut_29_0;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            stackOut_27_0 = null;
                            stackIn_28_0 = stackOut_27_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        } else {
                          var7 = param1.charAt(var6);
                          if (ul.a((char) var7, (byte) 125)) {
                            L7: {
                              var8 = wi.a(true, (char) var7);
                              if (var8 != 0) {
                                discarded$3 = var5.append((char) var8);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            var6++;
                            continue L6;
                          } else {
                            var6++;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      stackOut_16_0 = null;
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var2);
            stackOut_31_1 = new StringBuilder().append("hq.D(").append(param0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L8;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L8;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_17_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (String) ((Object) stackIn_28_0);
            } else {
              return stackIn_30_0;
            }
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param2 != -28186) {
            this.e(20);
        }
        if (1 << param1 == this.field_h.field_s) {
            if (!this.field_h.a(param0, (byte) 127)) {
                nk.field_e = true;
                this.g(20);
            } else {
                this.c(param2 ^ -28391);
                nk.field_e = false;
            }
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        pl.field_b.field_eb = -3 + al.field_k.field_Db - pl.field_b.field_Db;
        pl.field_b.field_qb = 277;
        if (param0 != 1) {
            return;
        }
        qa.field_v.field_qb = 297 + al.field_k.field_qb;
        qa.field_v.field_eb = -qa.field_v.field_Db + al.field_k.field_eb - (-al.field_k.field_Db + 3);
        jq.field_d.field_eb = -3 + (al.field_k.field_Db - jq.field_d.field_Db);
        jq.field_d.field_qb = 317;
        for (var2 = 0; var2 < this.field_k; var2++) {
        }
    }

    final void g(int param0) {
        if (!this.field_b) {
            this.field_b = true;
            if (!(null == this.field_h)) {
                this.field_h.a((hq) (this), 74);
            }
            qa.field_v.field_G = vm.field_d[14];
            qa.field_v.field_hb = vm.field_d[6];
            if (ca.field_i == -1) {
                ca.field_i = 0;
            } else {
                ca.field_i = 25 + -ca.field_i;
            }
            qa.field_v.field_xb = vm.field_d[10];
            qa.field_v.field_ab = vm.field_d[2];
        }
        int var2 = -81 % ((-32 - param0) / 38);
    }

    private final void a(bk param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
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
            if (param1 == 1) {
              L1: {
                this.field_h = param0;
                if (this.field_h != null) {
                  this.field_h.a((hq) (this), 94);
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("hq.V(");
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
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0) {
        if (param0 != -87) {
            this.field_g = (String) null;
        }
        if (this.field_h.field_k != this.field_d.field_e) {
            if (this.field_h != null) {
                if (!(this.field_h == this.field_d.field_e)) {
                    this.field_l = this.field_h;
                    ng.field_s = 0;
                }
            }
            this.a((bk) ((Object) this.field_h.field_k), 1);
            this.g(-109);
        }
    }

    hq(String param0, int param1, int param2) {
        try {
            this.field_g = param0;
            this.field_d = new ko();
            this.field_n = param2;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "hq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void i(int param0) {
        eg discarded$0 = null;
        field_f = null;
        field_o = null;
        field_e = null;
        field_m = null;
        if (param0 != 5) {
            discarded$0 = hq.b((byte) 8);
        }
    }

    static {
        field_o = "Find opponents";
        field_e = "Send private Quick Chat to <%0>";
        field_f = "(<%0> players want to join)";
        field_c = 2;
    }
}
