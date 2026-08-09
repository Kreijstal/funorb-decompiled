/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends pk {
    static String field_t;
    int field_w;
    static int field_y;
    boolean field_C;
    int field_M;
    int field_H;
    private int field_u;
    private int field_v;
    static String field_G;
    private int field_A;
    private int field_L;
    int field_I;
    int field_r;
    private int field_z;
    private int field_E;
    private int field_m;
    String field_q;
    private int field_x;
    private int field_p;
    private int[] field_n;
    int field_B;
    lh field_J;
    private int field_s;
    private int field_F;
    private int field_o;
    int field_K;
    int field_N;
    private int field_O;
    private int field_D;

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11;
        wb.a(this.field_i, this.field_k, this.field_l, this.field_c, -1 + (this.field_c >> 1381354337), param8, param5);
        var11 = this.field_c + -(this.field_K << 1226827041);
        wb.a(this.field_K + this.field_i, this.field_k - -this.field_K, this.field_l + -(this.field_K << -2126489599), var11, (var11 >> -1825822559) + -1, param4, param3);
        wb.b(this.field_n);
        if (param6 != 12054) {
          return;
        } else {
          wb.b(this.field_i, this.field_k, this.field_i - -this.field_l, this.field_k - -this.field_c);
          this.field_J.a(this.field_q, param0 + this.field_i, this.field_k - -param1, this.field_l, this.field_c, param9, param7, param2, this.field_m, this.field_L, this.field_x);
          wb.a(this.field_n);
          return;
        }
    }

    public static void a(int param0) {
        field_G = null;
        if (param0 != -29115) {
            return;
        }
        field_t = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var5;
        var5 = Chess.field_G;
        if (param3 == 3) {
          if (0 == param0) {
            if (param1 == 0) {
              if (param1 != 1) {
                if (param1 != 6) {
                  if (-6 == (param1 ^ -1)) {
                    wf.a(um.field_l[1], 44);
                    return;
                  } else {
                    wf.a(um.field_l[2], param3 ^ 107);
                    return;
                  }
                } else {
                  wf.a(um.field_l[1], 44);
                  return;
                }
              } else {
                wf.a(um.field_l[3], -65);
                return;
              }
            } else {
              wf.a(um.field_l[8], 114);
              return;
            }
          } else {
            ib.field_a = bc.field_b;
            rf.b(80, bc.field_b / 3);
            mf.a(gl.field_b, 0);
            return;
          }
        } else {
          field_y = 58;
          if (0 == param0) {
            if (param1 == 0) {
              if (param1 != 1) {
                if (param1 != 6) {
                  if (-6 == (param1 ^ -1)) {
                    wf.a(um.field_l[1], 44);
                    return;
                  } else {
                    wf.a(um.field_l[2], param3 ^ 107);
                    return;
                  }
                } else {
                  wf.a(um.field_l[1], 44);
                  return;
                }
              } else {
                wf.a(um.field_l[3], -65);
                return;
              }
            } else {
              wf.a(um.field_l[8], 114);
              return;
            }
          } else {
            ib.field_a = bc.field_b;
            rf.b(80, bc.field_b / 3);
            mf.a(gl.field_b, 0);
            return;
          }
        }
    }

    final void c(byte param0) {
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        if (param0 == -95) {
          if (this.field_e) {
            if (!this.field_C) {
              this.field_f = false;
              this.field_d = false;
              return;
            } else {
              L0: {
                L1: {
                  stackIn_22_0 = this;

                  if (!this.a((byte) -9)) {
                    break L1;
                  } else {
                    stackIn_22_0 = this;

                    if (wh.field_f != 0) {
                      break L1;
                    } else {
                      stackIn_22_0 = this;

                      if (!this.field_f) {
                        break L1;
                      } else {
                        stackIn_23_0 = this;
                        stackIn_23_1 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackIn_23_0 = this;
                stackIn_23_1 = 0;
                break L0;
              }
              L2: {
                ((eb) (this)).field_d = stackIn_23_1 != 0;
                stackIn_25_0 = this;

                if (wh.field_f == 0) {
                  stackIn_26_0 = this;
                  stackIn_26_1 = 0;
                  break L2;
                } else {
                  stackIn_26_0 = this;
                  stackIn_26_1 = 1;
                  break L2;
                }
              }
              ((eb) (this)).field_f = stackIn_26_1 != 0;
              return;
            }
          } else {
            this.field_f = false;
            this.field_d = false;
            return;
          }
        } else {
          eb.a(8);
          if (this.field_e) {
            if (this.field_C) {
              L3: {
                L4: {
                  stackIn_9_0 = this;

                  if (!this.a((byte) -9)) {
                    break L4;
                  } else {
                    stackIn_9_0 = this;

                    if (wh.field_f != 0) {
                      break L4;
                    } else {
                      stackIn_9_0 = this;

                      if (!this.field_f) {
                        break L4;
                      } else {
                        stackIn_10_0 = this;
                        stackIn_10_1 = 1;
                        break L3;
                      }
                    }
                  }
                }
                stackIn_10_0 = this;
                stackIn_10_1 = 0;
                break L3;
              }
              L5: {
                ((eb) (this)).field_d = stackIn_10_1 != 0;
                stackIn_12_0 = this;

                if (wh.field_f == 0) {
                  stackIn_13_0 = this;
                  stackIn_13_1 = 0;
                  break L5;
                } else {
                  stackIn_13_0 = this;
                  stackIn_13_1 = 1;
                  break L5;
                }
              }
              ((eb) (this)).field_f = stackIn_13_1 != 0;
              return;
            } else {
              this.field_f = false;
              this.field_d = false;
              return;
            }
          } else {
            this.field_f = false;
            this.field_d = false;
            return;
          }
        }
    }

    final void d(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = Chess.field_G;
        if (this.field_C) {
          if (this.field_J != null) {
            if (null != this.field_q) {
              var9 = 56 % ((-64 - param0) / 58);
              if (this.a((byte) -9)) {
                if (-1 != (wh.field_f ^ -1)) {
                  var5 = bk.field_k & this.field_u;
                  var2 = this.field_p & bk.field_k;
                  var4 = this.field_E;
                  var3 = this.field_p >>> uc.field_d;
                  var7 = bk.field_k & this.field_N;
                  var6 = this.field_u >>> uc.field_d;
                  var10 = this.field_v;
                  var11 = this.field_w;
                  var8 = this.field_N >>> uc.field_d;
                  this.a(var10, var11, var3, var6, var5, var8, 12054, var4, var7, var2);
                  return;
                } else {
                  var5 = this.field_o & bk.field_k;
                  var2 = bk.field_k & this.field_D;
                  var4 = this.field_O;
                  var3 = this.field_D >>> uc.field_d;
                  var6 = this.field_o >>> uc.field_d;
                  var7 = bk.field_k & this.field_s;
                  var11 = this.field_I;
                  var10 = this.field_A;
                  var8 = this.field_s >>> uc.field_d;
                  this.a(var10, var11, var3, var6, var5, var8, 12054, var4, var7, var2);
                  return;
                }
              } else {
                var5 = this.field_z & bk.field_k;
                var3 = this.field_B >>> uc.field_d;
                var4 = this.field_M;
                var2 = bk.field_k & this.field_B;
                var6 = this.field_z >>> uc.field_d;
                var7 = bk.field_k & this.field_H;
                var8 = this.field_H >>> uc.field_d;
                var10 = this.field_F;
                var11 = this.field_r;
                this.a(var10, var11, var3, var6, var5, var8, 12054, var4, var7, var2);
                return;
              }
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

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -1) {
              stackIn_4_0 = fh.a(param0, 5, false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("eb.H(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    eb(int param0, int param1, int param2, int param3, String param4) {
        this.field_v = 0;
        this.field_z = -2147483647;
        this.field_x = 0;
        this.field_E = -1;
        this.field_H = -1;
        this.field_p = -1;
        this.field_C = true;
        this.field_u = -16777215;
        this.field_r = 0;
        this.field_M = -1;
        this.field_B = -1;
        this.field_s = -2130706433;
        this.field_w = 0;
        this.field_L = 1;
        this.field_F = 0;
        this.field_I = 0;
        this.field_N = -2130706433;
        this.field_n = new int[4];
        this.field_m = 1;
        this.field_A = 0;
        this.field_o = -2147483647;
        this.field_D = -1;
        this.field_O = -1;
        this.field_K = 2;
        try {
            this.field_c = param3;
            this.field_l = param2;
            this.field_q = param4;
            this.field_k = param1;
            this.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "eb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = "Searching for an opponent";
        field_G = "This option cannot be combined with the current settings for:  ";
    }
}
