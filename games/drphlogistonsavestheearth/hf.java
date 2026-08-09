/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hf extends vg {
    private boolean field_F;
    static nh field_D;
    static int[] field_H;
    boolean field_E;
    private boolean field_B;
    static nh field_z;
    static int field_C;
    boolean field_A;
    static int[] field_G;

    final static String g(int param0) {
        if (param0 != -1) {
            field_D = (nh) null;
            if (em.field_c) {
                return null;
            }
            if (dd.field_l < qe.field_c) {
                return null;
            }
            if (!(dd.field_l >= je.field_j + qe.field_c)) {
                return ie.field_C;
            }
            return null;
        }
        if (em.field_c) {
            return null;
        }
        if (dd.field_l < qe.field_c) {
            return null;
        }
        if (!(dd.field_l >= je.field_j + qe.field_c)) {
            return ie.field_C;
        }
        return null;
    }

    hf(String param0, fd param1) {
        this(param0, ja.field_Q.field_b, param1);
    }

    final void c(byte param0) {
        int var2;
        var2 = 71 % ((param0 - -10) / 51);
        if (this.field_F) {
          this.field_F = false;
          if (null != this.field_u) {
            if (this.field_u instanceof pl) {
              ((pl) ((Object) this.field_u)).a((vg) (this), this.field_F, false);
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void f(int param0) {
        if (param0 != 7966) {
            return;
        }
        field_D = null;
        field_G = null;
        field_H = null;
        field_z = null;
    }

    void a(vg param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        vg var6 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -128);
              if (this.field_y == 0) {
                break L1;
              } else {
                if (db.field_a == this.field_y) {
                  break L1;
                } else {
                  L2: {
                    if (!this.a(param2, param1, false, ck.field_c, ob.field_g)) {
                      break L2;
                    } else {
                      if (-1 != (db.field_a ^ -1)) {
                        break L2;
                      } else {
                        this.a(this.field_y, 26982, -param2 + ob.field_g, ck.field_c - param1);
                        break L2;
                      }
                    }
                  }
                  this.a(param1, param2, ob.field_g, param0, ck.field_c, false);
                  break L1;
                }
              }
            }
            if (param3 < -127) {
              break L0;
            } else {
              var6 = (vg) null;
              this.a(-47, 85, 6, (vg) null, -99, true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("hf.I(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    hf(String param0, cg param1, fd param2) {
        super(param0, param1, param2);
        this.field_E = true;
        this.field_B = true;
        this.field_F = false;
    }

    final void a(int param0, int param1, int param2, vg param3, int param4, boolean param5) {
        if (param5) {
            return;
        }
        try {
            if (null != this.field_u && this.field_u instanceof se) {
                ((se) ((Object) this.field_u)).a(param2, param4, param0, 17437, (hf) (this), param1);
            }
            this.field_y = 0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "hf.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(boolean param0, vg param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
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
            if (!this.field_E) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_B) {
                L1: {
                  param1.c((byte) 122);
                  if (!param0) {
                    break L1;
                  } else {
                    this.a(5, -103, -59, -102);
                    break L1;
                  }
                }
                L2: {
                  this.field_F = true;
                  if (null == this.field_u) {
                    break L2;
                  } else {
                    if (this.field_u instanceof pl) {
                      ((pl) ((Object) this.field_u)).a((vg) (this), this.field_F, false);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_12_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("hf.M(").append(param0).append(',');

            if (param1 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        vg var6;
        L0: {
          if (null == this.field_u) {
            break L0;
          } else {
            if (this.field_u instanceof ke) {
              ((ke) ((Object) this.field_u)).a(param2, param3, true, (hf) (this), param0);
              break L0;
            } else {
              if (param1 == 26982) {
                return;
              } else {
                var6 = (vg) null;
                this.a((vg) null, -40, 15, (byte) 63);
                return;
              }
            }
          }
        }
        if (param1 != 26982) {
          var6 = (vg) null;
          this.a((vg) null, -40, 15, (byte) 63);
          return;
        } else {
          return;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            hf.f(-19);
            return this.field_F;
        }
        return this.field_F;
    }

    boolean a(int param0, char param1, vg param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(true)) {
                break L1;
              } else {
                L2: {
                  if ((param0 ^ -1) == -85) {
                    break L2;
                  } else {
                    if (-84 == (param0 ^ -1)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                this.a(1, 26982, -1, -1);
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            if (param3 >= 63) {
              stackIn_9_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              hf.g(37);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("hf.BA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_E) {
                break L1;
              } else {
                if (!this.a(param6, param5, false, param4, param0)) {
                  break L1;
                } else {
                  L2: {
                    this.a(false, param1);
                    this.field_y = param2;
                    if (this.field_u == null) {
                      break L2;
                    } else {
                      if (this.field_u instanceof se) {
                        ((se) ((Object) this.field_u)).a(param0, param6, 5708, param2, param5, param4, (hf) (this));
                        break L2;
                      } else {
                        return true;
                      }
                    }
                  }
                  stackIn_7_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L3: {
              if (param3 >= 113) {
                break L3;
              } else {
                field_H = (int[]) null;
                break L3;
              }
            }
            stackIn_11_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("hf.JA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    protected hf() {
        this.field_E = true;
        this.field_B = true;
        this.field_F = false;
        this.field_l = ja.field_Q.field_a;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == -10612) {
              L1: {
                if (!this.a(param1, param2, param0, 101)) {
                  break L1;
                } else {
                  L2: {
                    this.a(param2, (byte) 89, param0, param1);
                    if (!this.field_A) {
                      break L2;
                    } else {
                      discarded$2 = param2.append(" active");
                      break L2;
                    }
                  }
                  if (this.field_E) {
                    break L1;
                  } else {
                    discarded$3 = param2.append(" disabled");
                    break L1;
                  }
                }
              }
              stackIn_9_0 = (StringBuilder) (param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("hf.WA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_9_0;
        }
    }

    static {
        field_H = new int[]{0, 50, 50, 50, 50, 50, 150, 30, 50, 140, 70, -1, 50, 50};
        field_G = new int[8192];
    }
}
