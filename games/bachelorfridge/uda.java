/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uda extends am {
    private int field_Z;
    static int[] field_X;
    static String[] field_cb;
    static String field_ab;
    private int field_W;
    private int field_V;
    private int field_db;
    static vr field_U;
    private hl field_S;
    private int field_bb;
    private kf field_Y;
    private wj field_T;
    static String field_eb;

    boolean a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var3;
        var3 = BachelorFridge.field_y;
        if (null == this.field_Y) {
          if (param0 >= -32) {
            return false;
          } else {
            return super.a(-118);
          }
        } else {
          if (pj.field_n == this.field_Y) {
            fieldTemp$0 = this.field_Z + 1;
            this.field_Z = this.field_Z + 1;
            if (fieldTemp$0 == this.field_W) {
              this.field_Y = cp.field_b;
              this.a(this.field_db, 26012, this.field_T.field_q + 12 + this.field_bb, 12 - -this.field_T.field_p);
              this.field_S.field_F = 0;
              this.field_Z = 0;
              if (param0 >= -32) {
                return false;
              } else {
                return super.a(-118);
              }
            } else {
              this.field_S.field_F = -((this.field_Z << 1370402184) / this.field_W) + 256;
              if (param0 >= -32) {
                return false;
              } else {
                return super.a(-118);
              }
            }
          } else {
            if (this.field_Y == dha.field_b) {
              fieldTemp$1 = this.field_Z + 1;
              this.field_Z = this.field_Z + 1;
              if (this.field_V != fieldTemp$1) {
                this.field_S.field_F = (this.field_Z << -74968056) / this.field_V;
                if (param0 >= -32) {
                  return false;
                } else {
                  return super.a(-118);
                }
              } else {
                this.field_Y = null;
                this.field_S.field_F = 256;
                if (param0 >= -32) {
                  return false;
                } else {
                  return super.a(-118);
                }
              }
            } else {
              if (param0 >= -32) {
                return false;
              } else {
                return super.a(-118);
              }
            }
          }
        }
    }

    final boolean k(int param0) {
        if (param0 >= -59) {
            return true;
        }
        this.m(17310);
        return super.k(-79);
    }

    final static void b(boolean param0, int param1, int param2, int param3) {
        if (param3 < 13) {
            return;
        }
        qm.a(false, param0, param1, param2);
    }

    public static void n(int param0) {
        if (param0 <= 109) {
          uda.n(-52);
          field_U = null;
          field_X = null;
          field_cb = null;
          field_ab = null;
          field_eb = null;
          return;
        } else {
          field_U = null;
          field_X = null;
          field_cb = null;
          field_ab = null;
          field_eb = null;
          return;
        }
    }

    boolean a(int param0, int param1, char param2, wj param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
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
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_S != null) {
                L1: {
                  if (98 != param1) {
                    break L1;
                  } else {
                    this.field_S.a(param3, -101);
                    break L1;
                  }
                }
                L2: {
                  if ((param1 ^ -1) != -100) {
                    break L2;
                  } else {
                    this.field_S.a(param3, -94);
                    break L2;
                  }
                }
                stackIn_11_0 = 0;
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
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("uda.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final void b(boolean param0) {
        wj var3;
        if (pj.field_n != this.field_Y) {
          this.field_Y = dha.field_b;
          this.field_Z = 0;
          if (param0) {
            var3 = (wj) null;
            this.e((wj) null, 10);
            this.d(this.field_T, -15084);
            this.field_S.field_F = 0;
            this.field_T = null;
            return;
          } else {
            this.d(this.field_T, -15084);
            this.field_S.field_F = 0;
            this.field_T = null;
            return;
          }
        } else {
          return;
        }
    }

    uda(rp param0, wj param1, int param2, int param3, int param4) {
        super(param0, 12 - -param1.field_p, param1.field_q + (12 - -param2));
        try {
            this.field_db = param4;
            this.field_bb = param2;
            this.field_V = param3;
            this.field_W = param3;
            this.d(param1, -15084);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "uda.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void d(wj param0, int param1) {
        try {
            if (null != this.field_S) {
                this.field_S.a(false);
            }
            if (param0 == null) {
                this.field_S = new hl();
            } else {
                param0.a(6, param0.field_q, (byte) 59, param0.field_p, 6 - -this.field_bb);
                this.field_S = new hl(param0);
            }
            this.c(this.field_S, param1 + 15073);
            if (param1 != -15084) {
                this.field_Z = -77;
            }
            this.field_T = null;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "uda.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void e(wj param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_T = param0;
            if (param1 == 33) {
              if (this.field_Y == cp.field_b) {
                this.a(this.field_db, 26012, this.field_T.field_q + this.field_bb + 12, 12 + this.field_T.field_p);
                this.field_Z = 0;
                return;
              } else {
                if (pj.field_n != this.field_Y) {
                  this.field_Z = 0;
                  this.field_Y = pj.field_n;
                  return;
                } else {
                  return;
                }
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("uda.C(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final void m(int param0) {
        L0: {
          if (null != this.field_Y) {
            L1: {
              if (this.field_Y != dha.field_b) {
                this.b(-41, 12 + this.field_bb + this.field_T.field_q, 12 + this.field_T.field_p);
                this.d(this.field_T, -15084);
                break L1;
              } else {
                break L1;
              }
            }
            this.field_S.field_F = 256;
            this.field_Y = null;
            break L0;
          } else {
            break L0;
          }
        }
        super.m(param0 ^ 0);
        if (param0 != 17310) {
          this.b(false);
          return;
        } else {
          return;
        }
    }

    static {
        field_cb = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_ab = "Quit to website";
        field_eb = "Press F10 to open Quick Chat.";
    }
}
