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
            long dupTemp$2 = 0L;
            IOException var2 = null;
            ih var4 = null;
            ih var5 = null;
            int stackIn_14_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_12_0 = 0;
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
                L1: {
                  L2: {
                    dupTemp$2 = lj.a((byte) -47);
                    jd.field_n = dupTemp$2;
                    ug.field_d = dupTemp$2;
                    if (1 == gg.field_e.field_b) {
                      break L2;
                    } else {
                      rh.field_k = wb.field_q;
                      if (!fleas.field_A) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  try {
                    L3: {
                      L4: {
                        sg.field_h = new td((java.net.Socket) (gg.field_e.field_e), af.field_f);
                        ud.field_b.field_i = 0;
                        var4 = ae.field_a;
                        var5 = var4;
                        rh.field_k = d.field_O;
                        var5.field_i = 0;
                        if (!param1) {
                          stackOut_13_0 = -1;
                          stackIn_14_0 = stackOut_13_0;
                          break L4;
                        } else {
                          stackOut_12_0 = -2;
                          stackIn_14_0 = stackOut_12_0;
                          break L4;
                        }
                      }
                      hc.field_j = stackIn_14_0;
                      rj.field_k = stackIn_14_0;
                      vi.field_a = stackIn_14_0;
                      ob.a(cj.field_b, j.field_g, (byte) -127, bb.field_E, ud.field_b);
                      dk.b((byte) 41, -1);
                      decompiledRegionSelector0 = 0;
                      break L3;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var2 = (IOException) (Object) decompiledCaughtException;
                      rh.field_k = wb.field_q;
                      decompiledRegionSelector0 = 1;
                      break L5;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    gg.field_e = null;
                    return true;
                  } else {
                    break L1;
                  }
                }
                gg.field_e = null;
                return true;
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
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        boolean stackOut_13_0 = false;
        int stackOut_9_0 = 0;
        boolean stackOut_3_0 = false;
        var4 = fleas.field_A ? 1 : 0;
        if (!param1) {
          field_j = (String) null;
          var3 = this.field_a.length;
          L0: while (true) {
            L1: {
              if (param0 < var3) {
                stackOut_19_0 = var3;
                stackIn_20_0 = stackOut_19_0;
                break L1;
              } else {
                stackOut_13_0 = this.field_d;
                stackIn_20_0 = stackOut_13_0 ? 1 : 0;
                stackIn_14_0 = stackOut_13_0;
                if (var4 != 0) {
                  break L1;
                } else {
                  if (stackIn_14_0) {
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
            }
            return stackIn_20_0;
          }
        } else {
          var3 = this.field_a.length;
          L2: while (true) {
            L3: {
              if (param0 < var3) {
                stackOut_9_0 = var3;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_3_0 = this.field_d;
                stackIn_10_0 = stackOut_3_0 ? 1 : 0;
                stackIn_4_0 = stackOut_3_0;
                if (var4 != 0) {
                  break L3;
                } else {
                  if (stackIn_4_0) {
                    if (0 != var3) {
                      var3 = var3 * this.field_f;
                      continue L2;
                    } else {
                      var3 = 1;
                      continue L2;
                    }
                  } else {
                    var3 = var3 + this.field_f;
                    continue L2;
                  }
                }
              }
            }
            return stackIn_10_0;
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int discarded$4 = 0;
        int discarded$5 = 0;
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
            discarded$4 = this.b(-106);
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
            discarded$5 = this.b(-106);
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
        ob stackIn_18_0 = null;
        ob stackIn_21_0 = null;
        ob stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ob stackOut_5_0 = null;
        ob stackOut_9_0 = null;
        ob stackOut_13_0 = null;
        ob stackOut_17_0 = null;
        ob stackOut_20_0 = null;
        ob stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
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
              stackOut_5_0 = tf.field_H;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var2_int > 255) {
                stackOut_9_0 = hg.field_i;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = m.a('.', 114, param0);
                if ((var3.length ^ -1) > -3) {
                  stackOut_13_0 = tf.field_H;
                  stackIn_14_0 = stackOut_13_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var4 = var3;
                  var5 = 0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (var4.length <= var5) {
                          break L4;
                        } else {
                          var6 = var4[var5];
                          var7 = bj.a(param1 + -31656, var6);
                          stackOut_17_0 = (ob) (var7);
                          stackIn_24_0 = stackOut_17_0;
                          stackIn_18_0 = stackOut_17_0;
                          if (var8 != 0) {
                            break L3;
                          } else {
                            if (stackIn_18_0 != null) {
                              stackOut_20_0 = (ob) (var7);
                              stackIn_21_0 = stackOut_20_0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            } else {
                              var5++;
                              if (var8 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      stackOut_23_0 = oa.a(var3[var3.length - 1], -23);
                      stackIn_24_0 = stackOut_23_0;
                      break L3;
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var2);
            stackOut_25_1 = new StringBuilder().append("id.J(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
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
                return stackIn_24_0;
              } else {
                return stackIn_21_0;
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
