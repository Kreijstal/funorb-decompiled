/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kg extends vg {
    boolean field_z;
    private boolean field_A;
    private boolean field_B;
    static String field_C;
    boolean field_y;

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var5_int = 0;
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
              var5_int = 111 % ((64 - param0) / 61);
              if (this.a(false, param2, param3, param1)) {
                L2: {
                  this.a(param1, param2, false, param3);
                  if (!this.field_z) {
                    break L2;
                  } else {
                    discarded$2 = param3.append(" active");
                    break L2;
                  }
                }
                if (this.field_y) {
                  break L1;
                } else {
                  discarded$3 = param3.append(" disabled");
                  break L1;
                }
              } else {
                break L1;
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

            stackIn_10_1 = new StringBuilder().append("kg.NA(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

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
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    boolean a(byte param0, vg param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -88 / ((61 - param0) / 59);
            if (!this.field_y) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_B) {
                L1: {
                  param1.e((byte) -122);
                  this.field_A = true;
                  if (this.field_u == null) {
                    break L1;
                  } else {
                    if (this.field_u instanceof dj) {
                      ((dj) ((Object) this.field_u)).a(10202, this.field_A, (vg) (this));
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                stackIn_10_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("kg.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final boolean f(int param0) {
        if (param0 != 1) {
            this.field_y = false;
            return this.field_A;
        }
        return this.field_A;
    }

    boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
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
              if (!this.field_y) {
                break L1;
              } else {
                if (this.a(param1, 39, param3, param5, param4)) {
                  L2: {
                    this.a((byte) 124, param6);
                    this.field_o = param0;
                    if (null == this.field_u) {
                      break L2;
                    } else {
                      if (!(this.field_u instanceof dr)) {
                        break L2;
                      } else {
                        ((dr) ((Object) this.field_u)).a((kg) (this), param4, param3, param5, -237, param0, param1);
                        break L2;
                      }
                    }
                  }
                  stackIn_7_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param2 >= 95) {
              stackIn_11_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_A = false;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("kg.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    kg(String param0, iq param1, ko param2) {
        super(param0, param1, param2);
        this.field_B = true;
        this.field_A = false;
        this.field_y = true;
    }

    kg(String param0, ko param1) {
        this(param0, qq.field_I.field_q, param1);
    }

    final void e(byte param0) {
        int var2;
        if (this.field_A) {
          this.field_A = false;
          if (null != this.field_u) {
            if (!(this.field_u instanceof dj)) {
              var2 = -38 % ((param0 - -84) / 33);
              return;
            } else {
              ((dj) ((Object) this.field_u)).a(10202, this.field_A, (vg) (this));
              var2 = -38 % ((param0 - -84) / 33);
              return;
            }
          } else {
            var2 = -38 % ((param0 - -84) / 33);
            return;
          }
        } else {
          var2 = -38 % ((param0 - -84) / 33);
          return;
        }
    }

    final static void f(byte param0) {
        if (!(null == cb.field_h)) {
            cb.field_h.a(0);
        }
        if (param0 > -122) {
            field_C = (String) null;
            return;
        }
    }

    final static void a(int param0, long param1, String param2) {
        CharSequence var5 = null;
        if (param0 >= -41) {
            return;
        }
        try {
            gi.field_a = param2;
            em.field_h = 2;
            var5 = (CharSequence) ((Object) param2);
            nd.field_k = ji.a(var5, true);
            hd.field_k = param1;
            sr.field_h = true;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "kg.GA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    void a(int param0, int param1, vg param2, byte param3) {
        try {
            super.a(param0, param1, param2, param3);
            if (this.field_o != 0) {
                if (rf.field_n == this.field_o) {
                    return;
                }
                if (this.a(pd.field_k, 72, bb.field_b, param1, param0) && rf.field_n == 0) {
                    this.a(this.field_o, pd.field_k - param0, -param1 + bb.field_b, (byte) -109);
                }
                this.a(pd.field_k, param1, param0, bb.field_b, -600269855, param2);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "kg.PA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    boolean a(int param0, char param1, int param2, vg param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 13) {
              if (!this.f(1)) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L1: {
                  if (param0 == 84) {
                    break L1;
                  } else {
                    if (param0 == 83) {
                      break L1;
                    } else {
                      return false;
                    }
                  }
                }
                this.a(1, -1, -1, (byte) -109);
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("kg.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    protected kg() {
        this.field_B = true;
        this.field_A = false;
        this.field_y = true;
        this.field_p = qq.field_I.field_o;
    }

    void a(int param0, int param1, int param2, byte param3) {
        if (this.field_u != null) {
          if (this.field_u instanceof bp) {
            ((bp) ((Object) this.field_u)).a((kg) (this), 6, param0, param2, param1);
            if (param3 != -109) {
              return;
            } else {
              return;
            }
          } else {
            if (param3 != -109) {
              return;
            } else {
              return;
            }
          }
        } else {
          if (param3 != -109) {
            return;
          } else {
            return;
          }
        }
    }

    public static void d(boolean param0) {
        field_C = null;
        if (!param0) {
            kg.f((byte) -56);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, vg param5) {
        if (param4 != -600269855) {
            return;
        }
        try {
            if (this.field_u != null) {
                if (!(!(this.field_u instanceof dr))) {
                    ((dr) ((Object) this.field_u)).a(param2, param0, param3, param1, (kg) (this), (byte) -128);
                }
            }
            this.field_o = 0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "kg.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_C = "Remove <%0> from friend list";
    }
}
