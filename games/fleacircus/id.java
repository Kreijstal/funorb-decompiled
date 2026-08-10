/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class id {
    static int field_c;
    static int[] field_h;
    static String field_j;
    static char field_b;
    private int[] field_a;
    private int field_e;
    static String field_i;
    static int field_g;
    private boolean field_d;
    private int field_f;

    final static boolean a(boolean param0, boolean param1) {
        try {
            long dupTemp$1 = 0L;
            IOException var2 = null;
            ih var4 = null;
            ih var5 = null;
            int stackIn_13_0 = 0;
            Throwable decompiledCaughtException = null;
            if (!param0) {
              L0: {
                if (gg.field_e == null) {
                  gg.field_e = af.field_f.a(be.field_b, (byte) 32, a.field_d);
                  break L0;
                } else {
                  break L0;
                }
              }
              if (0 == gg.field_e.field_b) {
                return false;
              } else {
                dupTemp$1 = lj.a((byte) -47);
                jd.field_n = dupTemp$1;
                ug.field_d = dupTemp$1;
                if (1 == gg.field_e.field_b) {
                  try {
                    L1: {
                      L2: {
                        sg.field_h = new td((java.net.Socket) (gg.field_e.field_e), af.field_f);
                        ud.field_b.field_i = 0;
                        var4 = ae.field_a;
                        var5 = var4;
                        rh.field_k = d.field_O;
                        var5.field_i = 0;
                        if (!param1) {
                          stackIn_13_0 = -1;
                          break L2;
                        } else {
                          stackIn_13_0 = -2;
                          break L2;
                        }
                      }
                      hc.field_j = stackIn_13_0;
                      rj.field_k = stackIn_13_0;
                      vi.field_a = stackIn_13_0;
                      ob.a(cj.field_b, j.field_g, (byte) -127, bb.field_E, ud.field_b);
                      dk.b((byte) 41, -1);
                      break L1;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2 = (IOException) (Object) decompiledCaughtException;
                    rh.field_k = wb.field_q;
                    gg.field_e = null;
                    return true;
                  }
                  gg.field_e = null;
                  return true;
                } else {
                  rh.field_k = wb.field_q;
                  gg.field_e = null;
                  return true;
                }
              }
            } else {
              return false;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0) {
        if (bh.field_t == 10) {
          re.a(-17634);
          bh.field_t = 11;
          if (param0) {
            return;
          } else {
            rj.field_m = true;
            return;
          }
        } else {
          if (lk.a(-109)) {
            if (param0) {
              return;
            } else {
              rj.field_m = true;
              return;
            }
          } else {
            re.a(-17634);
            bh.field_t = 11;
            if (param0) {
              return;
            } else {
              rj.field_m = true;
              return;
            }
          }
        }
    }

    private final int a(int param0, boolean param1) {
        int var3;
        int var4;
        var4 = fleas.field_A ? 1 : 0;
        if (!param1) {
          field_j = (String) null;
          var3 = this.field_a.length;
          L0: while (true) {
            if (param0 < var3) {
              return var3;
            } else {
              if (this.field_d) {
                if (0 != var3) {
                  var3 = var3 * this.field_f;
                  continue L0;
                } else {
                  var3 = 1;
                  continue L0;
                }
              } else {
                var3 = var3 + this.field_f;
                continue L0;
              }
            }
          }
        } else {
          var3 = this.field_a.length;
          L1: while (true) {
            if (param0 < var3) {
              return var3;
            } else {
              if (this.field_d) {
                if (0 != var3) {
                  var3 = var3 * this.field_f;
                  continue L1;
                } else {
                  var3 = 1;
                  continue L1;
                }
              } else {
                var3 = var3 + this.field_f;
                continue L1;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (this.field_e >= param0) {
          L0: {
            if (param0 >= this.field_a.length) {
              this.a(0, param0);
              break L0;
            } else {
              break L0;
            }
          }
          if (param2 > -126) {
            this.b(-106);
            this.field_a[param0] = param1;
            return;
          } else {
            this.field_a[param0] = param1;
            return;
          }
        } else {
          L1: {
            this.field_e = param0;
            if (param0 >= this.field_a.length) {
              this.a(0, param0);
              break L1;
            } else {
              break L1;
            }
          }
          if (param2 <= -126) {
            this.field_a[param0] = param1;
            return;
          } else {
            this.b(-106);
            this.field_a[param0] = param1;
            return;
          }
        }
    }

    final int b(int param0, boolean param1) {
        if (param0 > this.field_e) {
          throw new ArrayIndexOutOfBoundsException(param0);
        } else {
          if (param1) {
            this.a(-40, -13, 81);
            return this.field_a[param0];
          } else {
            return this.field_a[param0];
          }
        }
    }

    final void b(int param0, int param1) {
        if (param0 == 1) {
          if (0 <= param1) {
            if (this.field_e >= param1) {
              if (this.field_e != param1) {
                dm.a(this.field_a, 1 + param1, this.field_a, param1, -param1 + this.field_e);
                this.field_e = this.field_e - 1;
                return;
              } else {
                this.field_e = this.field_e - 1;
                return;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param1);
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        } else {
          this.a(-59, -73, 120);
          if (0 <= param1) {
            if (this.field_e >= param1) {
              if (this.field_e == param1) {
                this.field_e = this.field_e - 1;
                return;
              } else {
                dm.a(this.field_a, 1 + param1, this.field_a, param1, -param1 + this.field_e);
                this.field_e = this.field_e - 1;
                return;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param1);
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        }
    }

    final static ob a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        ob var7 = null;
        int var8 = 0;
        ob stackIn_6_0 = null;
        ob stackIn_10_0 = null;
        ob stackIn_14_0 = null;
        ob stackIn_20_0 = null;
        ob stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 31592) {
                break L1;
              } else {
                field_h = (int[]) null;
                break L1;
              }
            }
            var2_int = param0.length();
            if (var2_int == 0) {
              stackIn_6_0 = tf.field_H;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var2_int > 255) {
                stackIn_10_0 = hg.field_i;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = m.a('.', 114, param0);
                if ((var3.length ^ -1) > -3) {
                  stackIn_14_0 = tf.field_H;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var4 = var3;
                  var5 = 0;
                  L2: while (true) {
                    if (var4.length <= var5) {
                      stackIn_23_0 = oa.a(var3[var3.length - 1], -23);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = bj.a(param1 + -31656, var6);
                      if (var7 != null) {
                        stackIn_20_0 = (ob) (var7);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("id.J(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L3;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0;
              } else {
                return stackIn_23_0;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1) {
        int[] var4 = new int[this.a(param1, true)];
        int[] var3 = var4;
        dm.a(this.field_a, 0, var4, param0, this.field_a.length);
        this.field_a = var4;
    }

    final void a(byte param0, int param1) {
        this.a(this.field_e - -1, param1, -127);
        int var3 = 56 / ((param0 - -33) / 51);
    }

    final int b(int param0) {
        if (param0 != 0) {
            id.a(true);
            return 1 + this.field_e;
        }
        return 1 + this.field_e;
    }

    final static boolean a(int param0) {
        if (param0 != -5935) {
            return false;
        }
        return wi.field_f == ui.field_kb ? true : false;
    }

    private id() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        int var1 = 33 / ((-80 - param0) / 42);
        field_i = null;
        field_j = null;
        field_h = null;
    }

    static {
        field_h = new int[150];
        field_j = "This password contains your email address, and would be easy to guess";
        field_g = 0;
    }
}
