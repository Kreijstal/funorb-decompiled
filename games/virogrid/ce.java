/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ce extends ec {
    private int field_J;
    static volatile boolean field_K;
    static int field_E;
    private boolean field_F;
    private int field_B;
    private boolean field_G;
    static int field_I;
    private int field_M;
    static String field_H;
    private int field_L;

    final boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                ce.f(-45);
                break L1;
              }
            }
            L2: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L2;
              } else {
                if (!this.field_G) {
                  break L2;
                } else {
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (this.a(param5, param6, param4, (byte) 94, param3)) {
              this.field_i = param1;
              if ((param1 ^ -1) == -2) {
                ra.field_b = (ce) (this);
                this.field_B = -this.field_u + param4 - param5;
                this.field_L = -this.field_l + param6 + -param3;
                stackIn_12_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return true;
              }
            } else {
              stackIn_8_0 = var8_int;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8);

            stackIn_15_1 = new StringBuilder().append("ce.NA(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final void a(int param0, int param1, fi param2, int param3) {
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(this.field_x instanceof tg)) {
                    break L3;
                  } else {
                    if (!((tg) ((Object) this.field_x)).field_C) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if ((this.field_i ^ -1) != -2) {
                  break L2;
                } else {
                  L4: {
                    var5_int = -param0 + (nl.field_u + -this.field_L);
                    var6 = -param3 + hk.field_Jb - this.field_B;
                    if (var5_int != this.field_l) {
                      break L4;
                    } else {
                      if (var6 == this.field_u) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_u = var6;
                  this.field_l = var5_int;
                  if (this.field_o instanceof pf) {
                    ((pf) ((Object) this.field_o)).a(param0, param3, (ce) (this), 104);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              if (this.field_F) {
                L5: {
                  if (this.field_M != this.field_l) {
                    L6: {
                      var5_int = -this.field_l + this.field_M;
                      stackIn_18_0 = this;

                      stackIn_18_1 = this.field_l;

                      if ((Math.abs(var5_int) ^ -1) < -3) {
                        stackIn_19_0 = this;
                        stackIn_19_1 = stackIn_18_1;
                        stackIn_19_2 = var5_int >> -1416068863;
                        break L6;
                      } else {
                        stackIn_17_0 = this;

                        if (-1 <= (var5_int ^ -1)) {
                          stackIn_19_0 = this;
                          stackIn_19_1 = stackIn_18_1;
                          stackIn_19_2 = -1;
                          break L6;
                        } else {
                          stackIn_19_0 = this;
                          stackIn_19_1 = stackIn_18_1;
                          stackIn_19_2 = 1;
                          break L6;
                        }
                      }
                    }
                    ((ce) (this)).field_l = stackIn_19_1 + stackIn_19_2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (this.field_J != this.field_u) {
                  L7: {
                    var5_int = this.field_J + -this.field_u;
                    stackIn_26_0 = this;

                    stackIn_26_1 = this.field_u;

                    if (2 < Math.abs(var5_int)) {
                      stackIn_27_0 = this;
                      stackIn_27_1 = stackIn_26_1;
                      stackIn_27_2 = var5_int >> -350442879;
                      break L7;
                    } else {
                      stackIn_25_0 = this;

                      if (0 >= var5_int) {
                        stackIn_27_0 = this;
                        stackIn_27_1 = stackIn_26_1;
                        stackIn_27_2 = -1;
                        break L7;
                      } else {
                        stackIn_27_0 = this;
                        stackIn_27_1 = stackIn_26_1;
                        stackIn_27_2 = 1;
                        break L7;
                      }
                    }
                  }
                  ((ce) (this)).field_u = stackIn_27_1 + stackIn_27_2;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L8: {
              if (param1 > 113) {
                break L8;
              } else {
                this.e(33);
                break L8;
              }
            }
            super.a(param0, 122, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var5);

            stackIn_34_1 = new StringBuilder().append("ce.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L9;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L9;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param3 + ')');
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
            long dupTemp$1 = 0L;
            IOException var2 = null;
            eh var3 = null;
            hg var5 = null;
            hg var6 = null;
            int stackIn_13_0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 < -35) {
                break L0;
              } else {
                var3 = (eh) null;
                ce.a(47, -49, (eh) null, -99);
                break L0;
              }
            }
            L1: {
              if (td.field_b == null) {
                td.field_b = qc.field_f.a(uh.field_b, 27402, fj.field_c);
                break L1;
              } else {
                break L1;
              }
            }
            if (td.field_b.field_a == 0) {
              return false;
            } else {
              dupTemp$1 = hc.a(-9986);
              ud.field_a = dupTemp$1;
              fa.field_l = dupTemp$1;
              if (td.field_b.field_a == 1) {
                try {
                  L2: {
                    L3: {
                      oj.field_Ub = new el((java.net.Socket) (td.field_b.field_f), qc.field_f);
                      var5 = sh.field_qb;
                      var6 = var5;
                      gk.field_g.field_l = 0;
                      if (param1) {
                        stackIn_13_0 = -2;
                        break L3;
                      } else {
                        stackIn_13_0 = -1;
                        break L3;
                      }
                    }
                    ah.field_e = stackIn_13_0;
                    pl.field_c = stackIn_13_0;
                    md.field_b = stackIn_13_0;
                    ug.field_a = ul.field_c;
                    var6.field_l = 0;
                    hj.a(m.field_m, gk.field_g, wc.field_m, oj.field_Yb, 12);
                    al.b(-1, -1);
                    break L2;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ug.field_a = bd.field_d;
                  td.field_b = null;
                  return true;
                }
                td.field_b = null;
                return true;
              } else {
                ug.field_a = bd.field_d;
                td.field_b = null;
                return true;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        if (param0 < 97) {
            return;
        }
        field_H = null;
    }

    final static rm[] a(int param0, int param1, eh param2, int param3) {
        RuntimeException var4 = null;
        rm[] stackIn_2_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -1979) {
              if (hn.a(param2, param3, param1, (byte) 109)) {
                return um.e((byte) 71);
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (rm[]) null;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("ce.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_2_0;
    }

    final StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(param0, param2, 34, param3)) {
                break L1;
              } else {
                this.a(param2, param0, (byte) 126, param3);
                this.a(param0, param3, 8651, param2);
                discarded$64 = param3.append(" revert=").append(this.field_F);
                if (this.field_M == 2147483647) {
                  break L1;
                } else {
                  if (-2147483648 == (this.field_J ^ -1)) {
                    break L1;
                  } else {
                    discarded$65 = param3.append(" to ").append(this.field_M).append(',').append(this.field_J);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param1 > 118) {
                break L2;
              } else {
                field_K = true;
                break L2;
              }
            }
            stackIn_7_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("ce.MA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    private ce(int param0, int param1, int param2, int param3, ol param4, cd param5, fi param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_J = 2147483647;
        this.field_M = 2147483647;
        try {
            this.field_x = param6;
            this.field_G = param8 ? true : false;
            this.field_F = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "ce.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                ce.a((byte) -87);
                break L1;
              }
            }
            stackIn_3_0 = co.a(false, param1, (byte) -101);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ce.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var4;
        gg.field_D.field_l = 0;
        if (param2 != -2) {
          field_H = (String) null;
          gg.field_D.a(12, 108);
          gg.field_D.a(mc.field_c.nextInt(), (byte) -42);
          gg.field_D.a(mc.field_c.nextInt(), (byte) -42);
          gg.field_D.a(param0, 112);
          gg.field_D.a(param1, param2 ^ -82);
          gg.field_D.a((byte) 65, param3);
          gg.field_D.a(on.field_a, ch.field_i, (byte) 86);
          gk.field_g.g(18, 8);
          fieldTemp$2 = gk.field_g.field_l + 1;
          gk.field_g.field_l = gk.field_g.field_l + 1;
          var4 = fieldTemp$2;
          gk.field_g.a(gg.field_D.field_g, gg.field_D.field_l, 0, (byte) -123);
          gk.field_g.b(-var4 + gk.field_g.field_l, -1);
          return;
        } else {
          gg.field_D.a(12, 108);
          gg.field_D.a(mc.field_c.nextInt(), (byte) -42);
          gg.field_D.a(mc.field_c.nextInt(), (byte) -42);
          gg.field_D.a(param0, 112);
          gg.field_D.a(param1, param2 ^ -82);
          gg.field_D.a((byte) 65, param3);
          gg.field_D.a(on.field_a, ch.field_i, (byte) 86);
          gk.field_g.g(18, 8);
          fieldTemp$3 = gk.field_g.field_l + 1;
          gk.field_g.field_l = gk.field_g.field_l + 1;
          var4 = fieldTemp$3;
          gk.field_g.a(gg.field_D.field_g, gg.field_D.field_l, 0, (byte) -123);
          gk.field_g.b(-var4 + gk.field_g.field_l, -1);
          return;
        }
    }

    final void e(int param0) {
        super.e(-78);
        this.field_x.a(this.field_m, true, 0, 0, this.field_g);
        if (param0 > -2) {
          return;
        } else {
          this.field_J = this.field_u;
          this.field_M = this.field_l;
          return;
        }
    }

    final static void f(int param0) {
        L0: {
          am.a((byte) -16);
          if (fi.field_v != null) {
            af.a((byte) -103, fi.field_v);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          nm.d(param0 ^ 13628);
          lh.a(true);
          kh.a(0);
          if (bg.f((byte) 121)) {
            gk.field_g.g(1, 8);
            al.b(-1, 0);
            break L1;
          } else {
            break L1;
          }
        }
        if (param0 != 13633) {
          return;
        } else {
          tn.a(false);
          return;
        }
    }

    final void a(int param0, int param1, int param2, fi param3, int param4, int param5) {
        super.a(param0, param1, param2, param3, param4, 108);
        if (param5 < 73) {
            return;
        }
        try {
            this.field_i = 0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "ce.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_H = "Connecting to<br>friend server...";
        field_I = 1;
        field_K = true;
    }
}
