/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends mh {
    mh field_Rb;
    static int field_Pb;
    mh field_Qb;
    fj field_Ub;
    static int field_Sb;
    static int field_Tb;

    final void a(boolean param0, int param1, boolean param2, int param3) {
        boolean discarded$0 = false;
        this.a(param3, 0, this.field_Qb.field_cb, param1, param2);
        if (!param0) {
            discarded$0 = this.a(85, true, 28, 9, 42, false, -118);
        }
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (null != gd.field_b) {
              L1: {
                var2_int = -66 / ((30 - param1) / 42);
                if (param0.toLowerCase().indexOf(gd.field_b.toLowerCase()) < 0) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("mm.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_zb = param4;
        if (param1 >= -108) {
          return;
        } else {
          this.field_cb = param6;
          this.field_Ib = param2;
          this.field_P = param3;
          this.b((byte) -45, param5, param0);
          return;
        }
    }

    mm(long param0, mh param1, mh param2, fj param3) {
        super(param0, (mh) null);
        try {
            this.field_Qb = new mh(0L, param2);
            this.field_Ub = new fj(0L, param3);
            this.a(this.field_Qb, 0);
            this.a(this.field_Ub, 0);
            this.field_Rb = param1;
            this.field_Qb.a(param1, 0);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "mm.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, boolean param4) {
        L0: {
          if (this.field_Ub.h(param1 ^ param1)) {
            this.field_Rb.field_Db = this.field_Rb.field_Db + param3;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (this.field_Ub.i(2)) {
            this.field_Rb.field_Db = this.field_Rb.field_Db - param3;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (this.field_Ub.j(param1 ^ 2)) {
            this.field_Rb.field_Db = this.field_Rb.field_Db + param2;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (this.field_Ub.d((byte) -79)) {
            this.field_Rb.field_Db = this.field_Rb.field_Db - param2;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (this.field_kb) {
            this.field_Rb.field_Db = this.field_Rb.field_Db - param0;
            break L4;
          } else {
            break L4;
          }
        }
        if (param4) {
          if (-1 >= (-(this.field_Rb.field_Db + this.field_Rb.field_zb) ^ -1)) {
            if (-(this.field_Rb.field_Db + this.field_Rb.field_zb) <= this.field_Rb.field_cb - -this.field_Rb.field_C - this.field_Qb.field_cb) {
              if (this.field_Ub.f((byte) 57)) {
                this.field_Rb.field_zb = -this.field_Ub.a(this.field_Rb.field_cb, this.field_Qb.field_cb, (byte) 106, param4);
                this.field_Rb.field_Db = 0;
                this.field_Ub.a(-76, this.field_Rb.field_cb, -this.field_Rb.field_zb, this.field_Qb.field_cb);
                return;
              } else {
                this.field_Ub.a(-76, this.field_Rb.field_cb, -this.field_Rb.field_zb, this.field_Qb.field_cb);
                return;
              }
            } else {
              this.field_Rb.field_Db = -this.field_Rb.field_zb + -(-this.field_Qb.field_cb + (this.field_Rb.field_cb + this.field_Rb.field_C));
              if (this.field_Ub.f((byte) 57)) {
                this.field_Rb.field_zb = -this.field_Ub.a(this.field_Rb.field_cb, this.field_Qb.field_cb, (byte) 106, param4);
                this.field_Rb.field_Db = 0;
                this.field_Ub.a(-76, this.field_Rb.field_cb, -this.field_Rb.field_zb, this.field_Qb.field_cb);
                return;
              } else {
                this.field_Ub.a(-76, this.field_Rb.field_cb, -this.field_Rb.field_zb, this.field_Qb.field_cb);
                return;
              }
            }
          } else {
            this.field_Rb.field_Db = -this.field_Rb.field_zb;
            if (-(this.field_Rb.field_Db + this.field_Rb.field_zb) <= this.field_Rb.field_cb - -this.field_Rb.field_C - this.field_Qb.field_cb) {
              if (this.field_Ub.f((byte) 57)) {
                this.field_Rb.field_zb = -this.field_Ub.a(this.field_Rb.field_cb, this.field_Qb.field_cb, (byte) 106, param4);
                this.field_Rb.field_Db = 0;
                this.field_Ub.a(-76, this.field_Rb.field_cb, -this.field_Rb.field_zb, this.field_Qb.field_cb);
                return;
              } else {
                this.field_Ub.a(-76, this.field_Rb.field_cb, -this.field_Rb.field_zb, this.field_Qb.field_cb);
                return;
              }
            } else {
              L5: {
                this.field_Rb.field_Db = -this.field_Rb.field_zb + -(-this.field_Qb.field_cb + (this.field_Rb.field_cb + this.field_Rb.field_C));
                if (!this.field_Ub.f((byte) 57)) {
                  break L5;
                } else {
                  this.field_Rb.field_zb = -this.field_Ub.a(this.field_Rb.field_cb, this.field_Qb.field_cb, (byte) 106, param4);
                  this.field_Rb.field_Db = 0;
                  break L5;
                }
              }
              this.field_Ub.a(-76, this.field_Rb.field_cb, -this.field_Rb.field_zb, this.field_Qb.field_cb);
              return;
            }
          }
        } else {
          L6: {
            if (-(this.field_Rb.field_Db + this.field_Rb.field_zb) > -this.field_Qb.field_cb + this.field_Rb.field_C + this.field_Rb.field_cb) {
              this.field_Rb.field_Db = -this.field_Rb.field_zb + -(this.field_Rb.field_C + this.field_Rb.field_cb - this.field_Qb.field_cb);
              break L6;
            } else {
              break L6;
            }
          }
          if (0 > -(this.field_Rb.field_zb - -this.field_Rb.field_Db)) {
            this.field_Rb.field_Db = -this.field_Rb.field_zb;
            if (!this.field_Ub.f((byte) 57)) {
              this.field_Ub.a(-76, this.field_Rb.field_cb, -this.field_Rb.field_zb, this.field_Qb.field_cb);
              return;
            } else {
              this.field_Rb.field_zb = -this.field_Ub.a(this.field_Rb.field_cb, this.field_Qb.field_cb, (byte) 106, param4);
              this.field_Rb.field_Db = 0;
              this.field_Ub.a(-76, this.field_Rb.field_cb, -this.field_Rb.field_zb, this.field_Qb.field_cb);
              return;
            }
          } else {
            if (!this.field_Ub.f((byte) 57)) {
              this.field_Ub.a(-76, this.field_Rb.field_cb, -this.field_Rb.field_zb, this.field_Qb.field_cb);
              return;
            } else {
              this.field_Rb.field_zb = -this.field_Ub.a(this.field_Rb.field_cb, this.field_Qb.field_cb, (byte) 106, param4);
              this.field_Rb.field_Db = 0;
              this.field_Ub.a(-76, this.field_Rb.field_cb, -this.field_Rb.field_zb, this.field_Qb.field_cb);
              return;
            }
          }
        }
    }

    private final boolean a(int param0, boolean param1, int param2, int param3, int param4, boolean param5, int param6) {
        int var8 = 0;
        if (!param1) {
          if (this.field_kb) {
            if (param5) {
              var8 = 0;
              this.field_Rb.a(this.field_Qb.field_cb, param0, -2147483648, var8 != 0);
              this.a(param2, param6, param4, param3, false);
              return var8 != 0;
            } else {
              var8 = 1;
              this.field_Rb.a(this.field_Qb.field_cb, param0, -2147483648, var8 != 0);
              this.a(param2, param6, param4, param3, false);
              return var8 != 0;
            }
          } else {
            var8 = 0;
            this.field_Rb.a(this.field_Qb.field_cb, param0, -2147483648, var8 != 0);
            this.a(param2, param6, param4, param3, false);
            return var8 != 0;
          }
        } else {
          var8 = 1;
          this.field_Rb.a(this.field_Qb.field_cb, param0, -2147483648, var8 != 0);
          this.a(param2, param6, param4, param3, false);
          return var8 != 0;
        }
    }

    private final void b(byte param0, int param1, int param2) {
        this.field_Rb.field_P = 0;
        this.field_Qb.field_cb = this.field_cb;
        this.field_Qb.field_Ib = -param2 + this.field_Ib - param1;
        if (param0 != -45) {
          this.a(-40, (byte) -114, -15, 122, 34, 27, 42);
          this.field_Rb.field_Ib = -param1 + (this.field_Ib + -param2);
          this.field_Ub.a(-param1 + this.field_Ib, this.field_Qb.field_cb, this.field_cb, (byte) -110, param1, -this.field_Rb.field_zb, this.field_Rb.field_cb, 0);
          return;
        } else {
          this.field_Rb.field_Ib = -param1 + (this.field_Ib + -param2);
          this.field_Ub.a(-param1 + this.field_Ib, this.field_Qb.field_cb, this.field_cb, (byte) -110, param1, -this.field_Rb.field_zb, this.field_Rb.field_cb, 0);
          return;
        }
    }

    final static void h(int param0) {
        boolean discarded$2 = false;
        l var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        String var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              eo.field_f.c();
              if (param0 == -29448) {
                break L1;
              } else {
                var3 = (String) null;
                discarded$2 = mm.a((String) null, (byte) 116);
                break L1;
              }
            }
            L2: {
              jk.field_w.c();
              bm.field_c = bm.field_c - 1;
              if (-1 != (bm.field_c ^ -1)) {
                break L2;
              } else {
                bm.field_c = 200;
                var1 = (l) ((Object) wd.field_v.d(-110));
                L3: while (true) {
                  if (var1 == null) {
                    if (jc.field_M != null) {
                      var1 = (l) ((Object) jc.field_M.d(param0 + 29407));
                      L4: while (true) {
                        if (var1 == null) {
                          break L2;
                        } else {
                          L5: {
                            if (var1.field_n.b(0)) {
                              break L5;
                            } else {
                              var1.b((byte) 111);
                              break L5;
                            }
                          }
                          var1 = (l) ((Object) jc.field_M.a((byte) 116));
                          continue L4;
                        }
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    L6: {
                      if (var1.field_n.b(0)) {
                        break L6;
                      } else {
                        var1.b((byte) 111);
                        break L6;
                      }
                    }
                    var1 = (l) ((Object) wd.field_v.a((byte) 116));
                    continue L3;
                  }
                }
              }
            }
            L7: {
              if (null == m.field_f) {
                break L7;
              } else {
                if (m.field_f.d(-1)) {
                  break L7;
                } else {
                  fo.field_a = null;
                  break L7;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1_ref), "mm.D(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        if (param3 != 22676) {
          field_Pb = 127;
          return this.a(param0, param5, param1, param2, this.field_Qb.field_cb, param4, 0);
        } else {
          return this.a(param0, param5, param1, param2, this.field_Qb.field_cb, param4, 0);
        }
    }

    static {
        field_Pb = 3;
    }
}
